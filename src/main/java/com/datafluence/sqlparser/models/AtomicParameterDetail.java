package com.datafluence.sqlparser.models;

import lombok.Data;

@Data
public class AtomicParameterDetail {
    private String timeContextExpression;
    private String defaultAggGranularity;
    private String filterExpression;
}
