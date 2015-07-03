package com.rigil.fda.builder;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.rigil.fda.json.FDAEnforcementReportResult;
import com.rigil.fda.json.report.FDADeviceEnforcementResponse;

public class SearchResultsBuilder {

	private final static Logger logger = LoggerFactory
			.getLogger(SearchResultsBuilder.class);

	public List<FDAEnforcementReportResult> getEnforcementReportsList(
			String searchData) {
		List<FDAEnforcementReportResult> enforcementsResultsList = new ArrayList<FDAEnforcementReportResult>();
		List<com.rigil.fda.json.report.Result> resultsList = new ArrayList<com.rigil.fda.json.report.Result>();
		resultsList = getDeviceSearchResults(searchData);
		resultsList = getFoodSearchResults(searchData, resultsList);
		resultsList = getDrugSearchResults(searchData, resultsList);
		enforcementsResultsList = getEnforcementReportJSONResults(resultsList);
		return enforcementsResultsList;
	}

	public List<com.rigil.fda.json.report.Result> getDeviceSearchResults(
			String deviceName) {
		List<com.rigil.fda.json.report.Result> resultsList = new ArrayList<com.rigil.fda.json.report.Result>();
		StringBuilder uriSB = new StringBuilder();
		uriSB.append("https://api.fda.gov/device/enforcement.json?search=product_description:\"");
		uriSB.append(deviceName);
		uriSB.append("\"&limit=10");
		logger.debug("uriSB - " + uriSB.toString());
		RestTemplate restTemplate = new RestTemplate();
		try {
			resultsList = restTemplate.getForObject(uriSB.toString(),
					FDADeviceEnforcementResponse.class).getResults();
		} catch (Exception e) {
			logger.error(
					"Error while querying the FDA Enforcement Report Web Service for Device - "
							+ deviceName, e);
			// e.printStackTrace();
		}
		return resultsList;
	}

	public List<com.rigil.fda.json.report.Result> getFoodSearchResults(
			String foodName, List<com.rigil.fda.json.report.Result> resultsList) {
		List<com.rigil.fda.json.report.Result> foodResultsList = new ArrayList<com.rigil.fda.json.report.Result>();
		StringBuilder uriSB = new StringBuilder();
		uriSB.append("https://api.fda.gov/food/enforcement.json?search=product_description:\"");
		uriSB.append(foodName);
		uriSB.append("\"&limit=10");
		logger.debug("uriSB - " + uriSB.toString());
		RestTemplate restTemplate = new RestTemplate();
		try {
			foodResultsList = restTemplate.getForObject(uriSB.toString(),
					FDADeviceEnforcementResponse.class).getResults();
			resultsList.addAll(foodResultsList);
		} catch (Exception e) {
			logger.error(
					"Error while querying the FDA Enforcement Report Web Service for Device - "
							+ foodName, e);
			// e.printStackTrace();
		}
		return resultsList;
	}

	public List<com.rigil.fda.json.report.Result> getDrugSearchResults(
			String drugName, List<com.rigil.fda.json.report.Result> resultsList) {
		List<com.rigil.fda.json.report.Result> drugResultsList = new ArrayList<com.rigil.fda.json.report.Result>();
		StringBuilder uriSB = new StringBuilder();
		uriSB.append("https://api.fda.gov/drug/enforcement.json?search=product_description:\"");
		uriSB.append(drugName);
		uriSB.append("\"&limit=10");
		logger.debug("uriSB - " + uriSB.toString());
		RestTemplate restTemplate = new RestTemplate();
		try {
			drugResultsList = restTemplate.getForObject(uriSB.toString(),
					FDADeviceEnforcementResponse.class).getResults();
			resultsList.addAll(drugResultsList);
		} catch (Exception e) {
			logger.error(
					"Error while querying the FDA Enforcement Report Web Service for Device - "
							+ drugName, e);
			// e.printStackTrace();
		}
		return resultsList;
	}

	public List<FDAEnforcementReportResult> getEnforcementReportJSONResults(
			List<com.rigil.fda.json.report.Result> resultsList) {
		List<FDAEnforcementReportResult> enforcementsResultsList = new ArrayList<FDAEnforcementReportResult>();
		for (com.rigil.fda.json.report.Result result : resultsList) {
			FDAEnforcementReportResult enforcementResult = new FDAEnforcementReportResult();
			logger.debug("recalling_firm - " + result.getRecallingFirm());
			enforcementResult.setRecallingFirm(result.getRecallingFirm());
			logger.debug("product_description: "
					+ result.getProductDescription());
			enforcementResult.setProductDescription(result
					.getProductDescription());
			logger.debug("reason_for_recall: " + result.getReasonForRecall());
			enforcementResult.setReasonForRecall(result.getReasonForRecall());
			logger.debug("recall_initiation_date - "
					+ result.getRecallInitiationDate());
			enforcementResult.setRecallInitiationDate(result
					.getRecallInitiationDate());
			logger.debug("report_date - " + result.getRecallInitiationDate());
			enforcementResult.setReportDate(result.getReportDate());
			enforcementsResultsList.add(enforcementResult);
		}
		return enforcementsResultsList;
	}

}
