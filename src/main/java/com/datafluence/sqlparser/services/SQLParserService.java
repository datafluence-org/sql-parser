package com.datafluence.sqlparser.services;

import com.datafluence.sqlparser.models.AtomicParameterDetail;
import com.datafluence.sqlparser.models.SQLParserInput;
import com.datafluence.sqlparser.models.SQLParserOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class SQLParserService {
    private final PrepareQueryInput prepareQueryInput;

    public SQLParserService(PrepareQueryInput prepareQueryInput) {
        this.prepareQueryInput = prepareQueryInput;
    }

    public SQLParserOutput generateSqlQuery(final SQLParserInput sqlParserInput){
        SQLParserOutput sqlParserOutput;
        sqlParserOutput = buildSqlQuery(sqlParserInput);
        return sqlParserOutput;
    }

    private SQLParserOutput buildSqlQuery(final SQLParserInput sqlParserInput){
        log.info("SQLParser building the query");
        SQLParserOutput sqlParserOutput = null;

        final Map<String, HashMap<AtomicParameterDetail, List<String>>> dataSetMetricMap = prepareQueryInput.datasetMetricMapping(sqlParserInput.getMetricMap());
        return sqlParserOutput;
    }
}
