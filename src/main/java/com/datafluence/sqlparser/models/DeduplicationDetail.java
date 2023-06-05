package com.datafluence.sqlparser.models;

import lombok.Data;

import java.util.List;
@Data
public class DeduplicationDetail {
    private List<String> uniqueIdList;
    private String latestTimeExpression;
}
