package com.datafluence.sqlparser.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class MetricMetadata {
    private List<Dataset> datasets;
    private JoinInfo joinInfo;
}
