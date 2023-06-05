package com.datafluence.sqlparser.models;

import lombok.Data;

@Data
public class JoinDetails {
    private String fromDataset;
    private String toDataset;
}
