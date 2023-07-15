package com.datafluence.sqlparser.models.enums;

public enum Granularity {
    TIME_DAY(0, "data_2.metric_date,", "data_2.metric_date", "(CAST(dt1.actual_date as DATE) = data_2.metric_date)",
            "data_2.metric_date"),
    TIME_WEEK(1, "data_2.year_nbr as metric_date_year,\n data_2.wk_nbr_in_year as metric_date_week,",
            "data_2.year_nbr,data_2.wk_nbr_in_year","(dt1.year_nbr = data_2.metric_date_year) and " +
            "(dt1.wk_nbr_in_year = data_2.metric_date_week)", "data_2.metric_date_year, data_2.metric_date_week"),
    TIME_MONTH(2, "data_2.year_nbr as metric_date_year,\n data_2.month_nbr_in_year as metric_date_month,",
            "data_2.year_nbr,data_2.month_nbr_in_year","(dt1.year_nbr = data_2.metric_date_year) and " +
            "(dt1.month_nbr_in_year = data_2.metric_date_month)","data_2.metric_date_year,data_2.metric_date_month"),
    //TODO Check quarter column in eg_date_dim
    TIME_QTR(3, "data_2.year_nbr as metric_date_year,\n data_2.qtr_nbr_in_year as metric_date_qtr,",
            "data_2.year_nbr,data_2.qtr_nbr_in_year","(dt1.year_nbr = data_2.metric_date_year) and " +
            "(dt1.qtr_nbr_in_year = data_2.metric_date_qtr)","data_2.metric_date_year,data_2.metric_date_qtr"),
    TIME_YEAR(4,"data_2.year_nbr as metric_date_year,", "data_2.year_nbr",
            "(dt1.year_nbr = data_2.metric_date_year)","data_2.metric_date_year");
    private final int value;
    private final String colExpr;
    private final String groupByExpr;
    private final String joinExpr;
    private final String groupByExprDerived;

    Granularity(int value, String colExpr, String groupByExpr, String joinExpr, String groupByExprDerived){
        this.value=value;
        this.colExpr = colExpr;
        this.groupByExpr = groupByExpr;
        this.joinExpr = joinExpr;
        this.groupByExprDerived = groupByExprDerived;
    }
    public int getValue() {
        return value;
    }
    public String getColExpr(){
        return colExpr;
    }
    public String getGroupByExpr(){
        return groupByExpr;
    }
    public String getJoinExpr() {
        return  joinExpr;
    }

    public String getGroupByExprDerived() {
        return groupByExprDerived;
    }
}
