package com.datafluence.sqlparser.models;

import com.datafluence.sqlparser.models.enums.AggregationType;
import com.datafluence.sqlparser.models.enums.MetricType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

@Getter
@Setter
@ToString
public class MetricHierarchy {

    String metricName;
    MetricType metricType;
    String definition;
    Integer numHop;
    String aggregationType;
    String defaultGranularity;
    String timeContextExpression;
    String sourceDataset;
    Aggregation aggregation;
    String filterExpression;
    Window window;
    String query;
    List<MetricHierarchy> dependentMetricHierarchyList;

    public MetricHierarchy(MetricObject metricObject){
        this.metricName = metricObject.getMetricDetails().getMetricName();
        this.metricType = metricObject.getMetricDetails().getMetricProperties().getMetricType();
        this.definition = metricObject.getMetricDetails().getMetricProperties().getDefinition();
        this.numHop = metricObject.getMetricDetails().getSqlMeta().getNumHop();
        if(Objects.isNull(metricObject.getMetricDetails().getMetricProperties().getAggregation().getAggregationType()))
            this.aggregationType = AggregationType.NONE.name();
        else
            this.aggregationType = metricObject.getMetricDetails().getMetricProperties().getAggregation().getDefaultAggGranularity().toUpperCase(Locale.ROOT);
        this.defaultGranularity = metricObject.getMetricDetails().getMetricProperties().getAggregation().getDefaultAggGranularity();
        this.sourceDataset = metricObject.getMetricDetails().getMetricProperties().getSourceDataset();
        this.timeContextExpression = metricObject.getMetricDetails().getMetricProperties().getAggregation().getTimeContextExpression();
        this.aggregation = metricObject.getMetricDetails().getMetricProperties().getAggregation();
        this.filterExpression = metricObject.getMetricDetails().getMetricProperties().getFilterExpression();
        this.window = metricObject.getMetricDetails().getMetricProperties().getWindow();
        this.query = metricObject.getMetricDetails().getSql();
    }

}
