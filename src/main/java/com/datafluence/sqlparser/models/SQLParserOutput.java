package com.datafluence.sqlparser.models;

import lombok.Data;

@Data
public class SQLParserOutput {
    private String sqlQuery;
    private Integer noOfHops;
    private String queryPlan;
    private String description;
}
