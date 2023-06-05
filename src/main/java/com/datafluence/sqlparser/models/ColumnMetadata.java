package com.datafluence.sqlparser.models;

import lombok.Data;

import java.util.List;
@Data
public class ColumnMetadata {
    private String columnName;
    private String columnCategory;
    private Boolean isContext;
    private Boolean isIdentifier;
    private List<String> aggregateGroup;
}
