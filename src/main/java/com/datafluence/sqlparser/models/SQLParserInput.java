package com.datafluence.sqlparser.models;

import lombok.Data;

import java.util.Map;

@Data
public class SQLParserInput {
    private QueryTemplate queryTemplate;
    private Map<String, MetricDefinitionTemplate> metricMap;
    private MetricQueryResponse metricQueryResponse;
    /** Need to add Persistent Layer object in future*/
}
