package com.datafluence.sqlparser.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MetricObject {
    private MetricDetails metricDetails;
    private MetricMetadata metricMetadata;
}
