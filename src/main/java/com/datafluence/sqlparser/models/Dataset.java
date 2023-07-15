package com.datafluence.sqlparser.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Dataset {
    private DatasetMetadata datasetMetadata;
    private List<ColumnMetadata> columnMetadataList;
    private DeduplicationDetail deduplicationDetail;
}
