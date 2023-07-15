package com.datafluence.sqlparser.models.enums;

public enum MetricCategory {
    STATIC,
    CONTINUOUS;

    public boolean isStatic(){ return this == MetricCategory.STATIC;}
    public boolean isContinuous(){ return this == MetricCategory.CONTINUOUS;}
}
