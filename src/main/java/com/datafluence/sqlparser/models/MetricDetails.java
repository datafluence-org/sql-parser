package com.datafluence.sqlparser.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MetricDetails {
    private String metricName;
    private MetricProperties metricProperties;
    private String sql;
    private SQLMeta sqlMeta;
}
