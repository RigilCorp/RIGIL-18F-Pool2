package com.rigil.fda.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rigil.fda.json.EnterpriseDocument;
import com.rigil.fda.support.SearchEnterpriseDocumentSupport;

@RestController
@RequestMapping("/search")
public class FDASearchRestController {

	private static final Logger logger = LoggerFactory.getLogger(FDASearchRestController.class);
	
	@Autowired
	SearchEnterpriseDocumentSupport enterpriseDocumentSupport;
	
	 @RequestMapping(method={
	            RequestMethod.POST,RequestMethod.PUT},
	            consumes="application/json", produces = "application/json"
	 )
	@ResponseBody
	public final EnterpriseDocument handleRequest(
			@Valid @RequestBody EnterpriseDocument enterpriseDocumentRequest) {

		logger.debug("Request received [{}]", enterpriseDocumentRequest);

		EnterpriseDocument enterpriseDocumentResponse = new EnterpriseDocument();

		enterpriseDocumentSupport.processRequest(enterpriseDocumentRequest,
				enterpriseDocumentResponse);

		logger.debug("Response sent [{}]", enterpriseDocumentResponse);
		return enterpriseDocumentResponse;
	}
	
}