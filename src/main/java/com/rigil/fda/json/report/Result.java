package com.rigil.fda.json.report;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "recall_number",
    "reason_for_recall",
    "status",
    "distribution_pattern",
    "product_quantity",
    "recall_initiation_date",
    "state",
    "event_id",
    "product_type",
    "product_description",
    "country",
    "city",
    "recalling_firm",
    "report_date",
    "@epoch",
    "voluntary_mandated",
    "classification",
    "code_info",
    "@id",
    "openfda",
    "initial_firm_notification"
})
public class Result {

    @JsonProperty("recall_number")
    private String recallNumber;
    @JsonProperty("reason_for_recall")
    private String reasonForRecall;
    @JsonProperty("status")
    private String status;
    @JsonProperty("distribution_pattern")
    private String distributionPattern;
    @JsonProperty("product_quantity")
    private String productQuantity;
    @JsonProperty("recall_initiation_date")
    private String recallInitiationDate;
    @JsonProperty("state")
    private String state;
    @JsonProperty("event_id")
    private String eventId;
    @JsonProperty("product_type")
    private String productType;
    @JsonProperty("product_description")
    private String productDescription;
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("recalling_firm")
    private String recallingFirm;
    @JsonProperty("report_date")
    private String reportDate;
    @JsonProperty("@epoch")
    private Double Epoch;
    @JsonProperty("voluntary_mandated")
    private String voluntaryMandated;
    @JsonProperty("classification")
    private String classification;
    @JsonProperty("code_info")
    private String codeInfo;
    @JsonProperty("@id")
    private String Id;
    @JsonProperty("openfda")
    private Openfda openfda;
    @JsonProperty("initial_firm_notification")
    private String initialFirmNotification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The recallNumber
     */
    @JsonProperty("recall_number")
    public String getRecallNumber() {
        return recallNumber;
    }

    /**
     * 
     * @param recallNumber
     *     The recall_number
     */
    @JsonProperty("recall_number")
    public void setRecallNumber(String recallNumber) {
        this.recallNumber = recallNumber;
    }

    /**
     * 
     * @return
     *     The reasonForRecall
     */
    @JsonProperty("reason_for_recall")
    public String getReasonForRecall() {
        return reasonForRecall;
    }

    /**
     * 
     * @param reasonForRecall
     *     The reason_for_recall
     */
    @JsonProperty("reason_for_recall")
    public void setReasonForRecall(String reasonForRecall) {
        this.reasonForRecall = reasonForRecall;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The distributionPattern
     */
    @JsonProperty("distribution_pattern")
    public String getDistributionPattern() {
        return distributionPattern;
    }

    /**
     * 
     * @param distributionPattern
     *     The distribution_pattern
     */
    @JsonProperty("distribution_pattern")
    public void setDistributionPattern(String distributionPattern) {
        this.distributionPattern = distributionPattern;
    }

    /**
     * 
     * @return
     *     The productQuantity
     */
    @JsonProperty("product_quantity")
    public String getProductQuantity() {
        return productQuantity;
    }

    /**
     * 
     * @param productQuantity
     *     The product_quantity
     */
    @JsonProperty("product_quantity")
    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * 
     * @return
     *     The recallInitiationDate
     */
    @JsonProperty("recall_initiation_date")
    public String getRecallInitiationDate() {
        return recallInitiationDate;
    }

    /**
     * 
     * @param recallInitiationDate
     *     The recall_initiation_date
     */
    @JsonProperty("recall_initiation_date")
    public void setRecallInitiationDate(String recallInitiationDate) {
        this.recallInitiationDate = recallInitiationDate;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The eventId
     */
    @JsonProperty("event_id")
    public String getEventId() {
        return eventId;
    }

    /**
     * 
     * @param eventId
     *     The event_id
     */
    @JsonProperty("event_id")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * 
     * @return
     *     The productType
     */
    @JsonProperty("product_type")
    public String getProductType() {
        return productType;
    }

    /**
     * 
     * @param productType
     *     The product_type
     */
    @JsonProperty("product_type")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * 
     * @return
     *     The productDescription
     */
    @JsonProperty("product_description")
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * 
     * @param productDescription
     *     The product_description
     */
    @JsonProperty("product_description")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The recallingFirm
     */
    @JsonProperty("recalling_firm")
    public String getRecallingFirm() {
        return recallingFirm;
    }

    /**
     * 
     * @param recallingFirm
     *     The recalling_firm
     */
    @JsonProperty("recalling_firm")
    public void setRecallingFirm(String recallingFirm) {
        this.recallingFirm = recallingFirm;
    }

    /**
     * 
     * @return
     *     The reportDate
     */
    @JsonProperty("report_date")
    public String getReportDate() {
        return reportDate;
    }

    /**
     * 
     * @param reportDate
     *     The report_date
     */
    @JsonProperty("report_date")
    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * 
     * @return
     *     The Epoch
     */
    @JsonProperty("@epoch")
    public Double getEpoch() {
        return Epoch;
    }

    /**
     * 
     * @param Epoch
     *     The @epoch
     */
    @JsonProperty("@epoch")
    public void setEpoch(Double Epoch) {
        this.Epoch = Epoch;
    }

    /**
     * 
     * @return
     *     The voluntaryMandated
     */
    @JsonProperty("voluntary_mandated")
    public String getVoluntaryMandated() {
        return voluntaryMandated;
    }

    /**
     * 
     * @param voluntaryMandated
     *     The voluntary_mandated
     */
    @JsonProperty("voluntary_mandated")
    public void setVoluntaryMandated(String voluntaryMandated) {
        this.voluntaryMandated = voluntaryMandated;
    }

    /**
     * 
     * @return
     *     The classification
     */
    @JsonProperty("classification")
    public String getClassification() {
        return classification;
    }

    /**
     * 
     * @param classification
     *     The classification
     */
    @JsonProperty("classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * 
     * @return
     *     The codeInfo
     */
    @JsonProperty("code_info")
    public String getCodeInfo() {
        return codeInfo;
    }

    /**
     * 
     * @param codeInfo
     *     The code_info
     */
    @JsonProperty("code_info")
    public void setCodeInfo(String codeInfo) {
        this.codeInfo = codeInfo;
    }

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("@id")
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The @id
     */
    @JsonProperty("@id")
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The openfda
     */
    @JsonProperty("openfda")
    public Openfda getOpenfda() {
        return openfda;
    }

    /**
     * 
     * @param openfda
     *     The openfda
     */
    @JsonProperty("openfda")
    public void setOpenfda(Openfda openfda) {
        this.openfda = openfda;
    }

    /**
     * 
     * @return
     *     The initialFirmNotification
     */
    @JsonProperty("initial_firm_notification")
    public String getInitialFirmNotification() {
        return initialFirmNotification;
    }

    /**
     * 
     * @param initialFirmNotification
     *     The initial_firm_notification
     */
    @JsonProperty("initial_firm_notification")
    public void setInitialFirmNotification(String initialFirmNotification) {
        this.initialFirmNotification = initialFirmNotification;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
