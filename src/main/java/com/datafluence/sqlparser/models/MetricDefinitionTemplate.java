package com.datafluence.sqlparser.models;

import lombok.Data;

import java.util.List;

@Data
public class MetricDefinitionTemplate {
    private String metricName;
    private String metricType;
    private String metricCategory;
    private String sourceDataset;
    private String definition;
    private Aggregation aggregation;
    private String window;
    private String filterExpression;
    private String persistence;
    private String category;
    private List<String> tags;
    private String description;
    private OwnerCommunicationDetails ownerCommunicationDetails;
}
