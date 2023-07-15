package com.datafluence.sqlparser.models.enums;

public enum AggregationType {

    SUM,
    COUNT,
    COUNT_DISTINCT,
    MAX,
    MIN,
    AVG,
    NONE;

    public boolean isSum() { return this == AggregationType.SUM;}
    public boolean isCount() { return this == AggregationType.COUNT;}
    public boolean isCountDistinct(){ return this == AggregationType.COUNT_DISTINCT};
    public boolean isMax(){ return this == AggregationType.MAX;}
    public boolean isMin(){ return this == AggregationType.MIN;}
    public boolean isAvg(){ return this == AggregationType.AVG;}
    public boolean isNone(){ return this == AggregationType.NONE;}

}
