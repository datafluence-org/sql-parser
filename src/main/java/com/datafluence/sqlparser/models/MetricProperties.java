package com.datafluence.sqlparser.models;

import com.datafluence.sqlparser.models.enums.MetricCategory;
import com.datafluence.sqlparser.models.enums.MetricType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class MetricProperties {
    private MetricType metricType;
    private String sourceDataset;
    private String definition;
    private Aggregation aggregation;
    private String filterExpression;
    private Window window;
    private MetricCategory category;
    private List<String> tags;
    private String description;
    private OwnerCommunicationDetails ownerCommunicationDetails;
}
