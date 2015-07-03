package com.rigil.fda.controller;

import com.rigil.fda.json.DocumentError;
import com.rigil.fda.json.DocumentHeader;
import com.rigil.fda.json.EnterpriseDocument;
import com.rigil.fda.json.EnterpriseDocument_;
import com.rigil.common.exception.ServiceErrorCode;
import com.rigil.common.exception.ServiceException;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.google.common.collect.Maps;

@ControllerAdvice
public class ExceptionHandlerController {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @Autowired
    private MessageSource messageSource;

    /**
     * Intercept Request Validation Exception.
     * @param ex
     * @return EnterpriseDocument
     */
    @RequestMapping(produces="application/json")
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    @ResponseBody
    public EnterpriseDocument handleRequestException(MethodArgumentNotValidException ex){

        ex.printStackTrace();

        EnterpriseDocument document = buildEnterPriseDocument();
        DocumentError error = new DocumentError();
        document.getEnterpriseDocument().setDocumentError(error);
        error.setErrorMessage(ServiceErrorCode.VALIDATION_FAILED.toString());

        Map<String, Object> errors = Maps.newHashMap();

        BindingResult result = ex.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();

        for(FieldError fieldError : fieldErrors){
            String localizedErrorMessage = resolveLocalizedErrorMessage(fieldError);
            errors.put(fieldError.getField(), localizedErrorMessage);
        }

        error.setAdditionalProperty("errors", errors);
        return document;
    }



    /**
     * Intercept FoundationServiceException
     * @param ex
     * @return EnterpriseDocument
     */
    @RequestMapping(produces="application/json")
    @ExceptionHandler({ServiceException.class,
        HttpMediaTypeNotSupportedException.class,
        HttpMessageNotReadableException.class,
        DataAccessResourceFailureException.class})
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    @ResponseBody
    public EnterpriseDocument handleRuntimeException(Exception ex){

        ex.printStackTrace();

        EnterpriseDocument document = buildEnterPriseDocument();
        DocumentError error = new DocumentError();
        document.getEnterpriseDocument().setDocumentError(error);

        if(ex instanceof ServiceException){
            error.setErrorMessage(ex.getMessage());
        }
        else if( ex instanceof HttpMediaTypeNotSupportedException){
            error.setErrorMessage("ErrorCode[" + ServiceErrorCode.HTTP_MEDIA_TYPE_NOT_SUPPORTED.getCode() + "]:" + " Http " + ex.getMessage());
        }
        else if(ex instanceof HttpMessageNotReadableException){
            error.setErrorMessage(ServiceErrorCode.HTTP_MESSAGE_NOT_READABLE_EXCEPTION.toString());
        }
        else if(ex instanceof DataAccessResourceFailureException){
            error.setErrorMessage(ServiceErrorCode.DATA_ACCESS_RESOURCE_FAILURE_EXCEPTION.toString());
        }

        return document;
    }

    @RequestMapping(produces="application/json")
    @ExceptionHandler({Exception.class})
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    @ResponseBody
    public EnterpriseDocument handleUncaughtException(Exception ex){

        ex.printStackTrace();

        EnterpriseDocument document = buildEnterPriseDocument();
        DocumentError error = new DocumentError();
        document.getEnterpriseDocument().setDocumentError(error);

        error.setErrorMessage("Unknown Exception has accured");
        return document;
    }

    private String resolveLocalizedErrorMessage(FieldError fieldError) {
        Locale currentLocale =  LocaleContextHolder.getLocale();
        String localizedErrorMessage = messageSource.getMessage(fieldError, currentLocale);

        //If the message was not found, return the most accurate field error code instead.
        //You can remove this check if you prefer to get the default error message.
        if (localizedErrorMessage.equals(fieldError.getDefaultMessage())) {
            String[] fieldErrorCodes = fieldError.getCodes();
            localizedErrorMessage = fieldErrorCodes[0];
        }
        return localizedErrorMessage;
    }

    private EnterpriseDocument buildEnterPriseDocument() {
        EnterpriseDocument document = new EnterpriseDocument();
        document.setEnterpriseDocument(new EnterpriseDocument_());
        document.getEnterpriseDocument().setDocumentHeader(new DocumentHeader());
        document.getEnterpriseDocument().setDocumentTimeStamp(new Date());
        return document;
    }
}
