package com.rigil.fda.support;

import com.rigil.fda.builder.SearchResultsBuilder;
import com.rigil.fda.json.DocumentBody;
import com.rigil.fda.json.EnterpriseDocument;
import com.rigil.fda.json.EnterpriseDocument_;
import com.rigil.fda.json.FDAEnforcementReportResult;
import com.rigil.fda.json.Request;
import com.rigil.fda.json.Response;
import com.rigil.fda.json.ResponseMessage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SearchEnterpriseDocumentSupport {

    private static final Logger logger = LoggerFactory
            .getLogger(SearchEnterpriseDocumentSupport.class);

    public static final String SEARCH_DATA = "searchData".toUpperCase();

    @Autowired
    SearchResultsBuilder searchResultsBuilder;

    public void processRequest(EnterpriseDocument enterpriseDocumentRequest,
            EnterpriseDocument enterpriseDocumentResponse) {

        enterpriseDocumentResponse
                .setEnterpriseDocument(new EnterpriseDocument_());
        enterpriseDocumentResponse.getEnterpriseDocument().setDocumentBody(
                new DocumentBody());
        enterpriseDocumentResponse.getEnterpriseDocument().getDocumentBody()
                .setResponse(new Response());
        enterpriseDocumentResponse.getEnterpriseDocument()
                .setDocumentTimeStamp(new Date());

        final String requestMethod = enterpriseDocumentRequest
                .getEnterpriseDocument().getDocumentBody().getRequest()
                .getRequestMethod().toUpperCase().trim();

        ResponseMessage responseMessage = null;

        switch (requestMethod) {
        case "GET": // handles GET request.

            logger.debug("Processing Search GET request.");
            responseMessage = processGetRequest(enterpriseDocumentRequest
                    .getEnterpriseDocument().getDocumentBody().getRequest());
            enterpriseDocumentResponse.getEnterpriseDocument()
                    .getDocumentBody().getResponse()
                    .setResponseMessage(responseMessage);
            break;
         default:
            /*
             * throw new EnterpriseDocumentException(
             * String.format("RequestMethod: [%s] is not supported. ",
             * requestMethod), EnterpriseDocumentException.ErrorCodeType.
             * REQUEST_METHOD_NOT_SUPPORTED);
             */
        }
    }

    /**
     *
     * @param request
     * @return ResponseMessage Process all GET requestMethod requests
     */
    private ResponseMessage processGetRequest(Request request) {

        logger.debug("ProcessGetRequest method invoked to query userEntity.");

        String searchData = request.getRequestMessage().getSearchRequest().getSearchData();
        return generateResponseMessage(searchData);
    }

    /**
     *
     * @param String
     * @return ResponseMessage This method
     *         generate ResponseMessage object of SearchResult.
     */
    private ResponseMessage generateResponseMessage(String searchData) {

        logger.debug("GenerateResponseMesasge method called.");
        ResponseMessage responseMessage = new ResponseMessage();
        List<FDAEnforcementReportResult> searchResults = new ArrayList<FDAEnforcementReportResult>();
        if (searchData != null) {
        	searchResults = searchResultsBuilder.getEnforcementReportsList(searchData);
        	
        }
        responseMessage.setSearchResponse(searchResults);
        return responseMessage;
    }

}
