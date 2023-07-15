package com.datafluence.sqlparser.services;

import com.datafluence.sqlparser.models.AtomicParameterDetail;
import com.datafluence.sqlparser.models.MetricDefinitionTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class PrepareQueryInput {
    public Map<String, HashMap<AtomicParameterDetail, List<String>>> datasetMetricMapping(final Map<String, MetricDefinitionTemplate> metricMap) {
     log.info("PrepareQueryInput :: datasetMetricMapping");
     return null;
    }
}
