package com.datafluence.sqlparser.services;

import com.datafluence.sqlparser.models.SQLParserInput;
import com.datafluence.sqlparser.models.SQLParserOutput;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SQLParserService {
    public SQLParserOutput generateSqlQuery(final SQLParserInput sqlParserInput){
        SQLParserOutput sqlParserOutput;
        sqlParserOutput = buildSqlQuery(sqlParserInput);
        return sqlParserOutput;
    }

    private SQLParserOutput buildSqlQuery(final SQLParserInput sqlParserInput){
        log.info("SQLParser building the query");
        SQLParserOutput sqlParserOutput = null;
        return sqlParserOutput;
    }
}
