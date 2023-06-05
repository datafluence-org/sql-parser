package com.datafluence.sqlparser.models;

import lombok.Data;

@Data
public class DatasetMetadata {
    private String datasetName;
    private String datasetType;
    private String domainName;
    private String datasetCategory;
    private String storageType;
    private String virtualQuery;
    private String sourceTableName;
}
