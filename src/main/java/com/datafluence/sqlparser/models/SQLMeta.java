package com.datafluence.sqlparser.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SQLMeta {
    private Integer numHop;
    private String description;
    private String queryPlan;
}
