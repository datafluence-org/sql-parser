package com.datafluence.sqlparser.models.enums;

public enum MetricType {
    ATOMIC,
    DERIVED,
    RATIO;

    public boolean isAtomic(){ return this == MetricType.ATOMIC;}
    public boolean isDerived(){ return this == MetricType.DERIVED;}
    public boolean isRatio(){ return this == MetricType.RATIO;}
}
