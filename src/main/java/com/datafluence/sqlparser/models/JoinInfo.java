package com.datafluence.sqlparser.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class JoinInfo {
    private String fromMetric;
    private String toMetric;
    private String fromDataset;
    private String toDataset;
    private List<JoinDetails> joinDetails;
}
