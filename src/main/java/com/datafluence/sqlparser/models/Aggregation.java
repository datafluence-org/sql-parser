package com.datafluence.sqlparser.models;

import lombok.Data;

@Data
public class Aggregation {
    private String timeContextExpression;
    private String aggregationType;
    private String defaultAggGranularity;
}
