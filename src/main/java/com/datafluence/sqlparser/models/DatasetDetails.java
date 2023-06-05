package com.datafluence.sqlparser.models;

import lombok.Data;

import java.util.List;
@Data
public class DatasetDetails {
    private DatasetMetadata datasetMetadata;
    private List<ColumnMetadata> columnMetadataList;
    private DeduplicationDetail deduplicationDetail;
}
