package com.datafluence.sqlparser.services;

import com.datafluence.sqlparser.models.Aggregation;
import com.datafluence.sqlparser.models.MetricHierarchy;
import com.datafluence.sqlparser.models.enums.Granularity;
import com.datafluence.sqlparser.models.enums.MetricType;
import com.datafluence.sqlparser.utils.Constants;

import java.util.Objects;

public class AtomicMetricSQLGenerator {

    public String generateSql(MetricHierarchy metricTree){
        String query = "";
        if(Objects.equals(metricTree.getMetricType(), MetricType.ATOMIC)){
            String source = metricTree.getSourceDataset();
            query = "from"+source+"src";
            String dateDimCol = "actual_date";
            query = createSelectExp(metricTree) +
                    addDateDimJoin(query, metricTree, dateDimCol) +
                    addFilterExpression(metricTree) +
                    createGroupByExpr(metricTree);
        }
        return query;
    }

    private String addDateDimJoin(String baseQuery, MetricHierarchy metricNode, String dateDimCol){
        String enrichedDateDimQuery = baseQuery;
        Aggregation aggDetails = metricNode.getAggregation();

        if(!Objects.isNull(aggDetails.getTimeContextExpression())){
            enrichedDateDimQuery = enrichedDateDimQuery + String.format("left join %s dt" + "on (%s = CAST(dt.%s as DATE))",
                    Constants.DATE_DIM_TABLE, aggDetails.getTimeContextExpression(), dateDimCol);
        }
        return enrichedDateDimQuery;
    }

    private String addFilterExpression(MetricHierarchy metricNode){
        return !Objects.isNull(metricNode.getFilterExpression()) ? "\nwhere " + metricNode.getFilterExpression() : "";
    }

    private String createSelectExp(MetricHierarchy metricNode){
        return String.format("select %s %n'%s' as metric_name, %n%s as metric_value%n",
                Granularity.valueOf(metricNode.getDefaultGranularity().toUpperCase())==Granularity.TIME_DAY ?
                "CAST(dt.actual_date AS DATE) as metric_date,": Granularity.valueOf(metricNode.getDefaultGranularity().toUpperCase()).getColExpr()
                        .replace("data_2","dt"), metricNode.getMetricName(), aggEnrichment(metricNode));
    }

    private String aggEnrichment(MetricHierarchy metricNode){
        if(metricNode.getAggregationType().equalsIgnoreCase("count_distinct")){
            return String.format("count(distinct(%s))",metricNode.getDefinition());
        } else {
            return String.format("%s(%s)", metricNode.getAggregationType().toLowerCase(), metricNode.getDefinition());
        }
    }

    private String createGroupByExpr(MetricHierarchy metricNode){
        return String.format("%nGROUP BY %s",Granularity.valueOf(metricNode.getDefaultGranularity().toUpperCase())==Granularity.TIME_DAY ?
                "CAST(dt.actual_date AS DATE)": Granularity.valueOf(metricNode.getDefaultGranularity().toUpperCase())
                .getGroupByExpr().replace("data_2","dt"));
    }
}
