package com.rigil.fda.builder;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.rigil.fda.json.FDAEnforcementReportResult;
import com.rigil.fda.json.report.FDADeviceEnforcementResponse;

public class SearchResultsBuilder {
	
    private final static Logger logger = LoggerFactory.getLogger(SearchResultsBuilder.class);
	
    public List<FDAEnforcementReportResult> getEnforcementReportsList(String deviceName)
    {
        List<FDAEnforcementReportResult> enforcementsResultsList = new ArrayList<FDAEnforcementReportResult>();
        StringBuilder uriSB = new StringBuilder();
        uriSB.append("https://api.fda.gov/device/enforcement.json?search=product_description:\"");
        uriSB.append(deviceName);
        uriSB.append("\"&limit=10");
        logger.debug("uriSB - "+ uriSB.toString());
        RestTemplate restTemplate = new RestTemplate();
        try{
            List<com.rigil.fda.json.report.Result> resultsList = restTemplate.getForObject(uriSB.toString(), FDADeviceEnforcementResponse.class).getResults();
            for(com.rigil.fda.json.report.Result result : resultsList)
            {
            	FDAEnforcementReportResult enforcementResult = new FDAEnforcementReportResult();
                logger.debug("recalling_firm - " + result.getRecallingFirm());
                enforcementResult.setRecallingFirm(result.getRecallingFirm());
                logger.debug("product_description: " + result.getProductDescription());
                enforcementResult.setProductDescription(result.getProductDescription());
                logger.debug("reason_for_recall: " + result.getReasonForRecall());
                enforcementResult.setReasonForRecall(result.getReasonForRecall());
                logger.debug("recall_initiation_date - " + result.getRecallInitiationDate());
                enforcementResult.setRecallInitiationDate(result.getRecallInitiationDate());
                logger.debug("report_date - " + result.getRecallInitiationDate());
                enforcementResult.setReportDate(result.getReportDate());
                enforcementsResultsList.add(enforcementResult);
             }
        }catch(Exception e)
        {
            logger.error("Error while querying the FDA Enforcement Report Web Service for Device - " + deviceName, e);
            //e.printStackTrace();
        }
        return enforcementsResultsList;
    }

}
