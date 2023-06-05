package com.datafluence.sqlparser.models;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Data
public class QueryTemplate {
    private List<String> queriedMetrics;
    private List<String> queriedDimensions;
    private String filterExpression;
    private String startDate;
    private String endDate;
    private String queriedAggGranularity;
}
