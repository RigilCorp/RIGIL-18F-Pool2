package com.rigil.fda.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"reportDate",
    "recallingFirm",
    "productDescription",
    "reasonForRecall",
    "recallInitiationDate",
})

public class FDAEnforcementReportResult {

    @JsonProperty("reportDate")
    private String reportDate;
    @JsonProperty("recallingFirm")
    private String recallingFirm;
    @JsonProperty("productDescription")
    private String productDescription;
    @JsonProperty("reasonForRecall")
    private String reasonForRecall;
    @JsonProperty("recallInitiationDate")
    private String recallInitiationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
    *
    * @return
       reportDate
    */
   @JsonProperty("reportDate")
   public String getReportDate() {
       return reportDate;
   }

   /**
    *
    * @param reportDate
    *     The reportDate
    */
   @JsonProperty("reportDate")
   public void setReportDate(String reportDate) {
       this.reportDate = reportDate;
   }
    
    /**
     *
     * @return
        recallingFirm
     */
    @JsonProperty("recallingFirm")
    public String getRecallingFirm() {
        return recallingFirm;
    }

    /**
     *
     * @param recallingFirm
     *     The recallingFirm
     */
    @JsonProperty("recallingFirm")
    public void setRecallingFirm(String recallingFirm) {
        this.recallingFirm = recallingFirm;
    }

    /**
     *
     * @return
     *     The productDescription
     */
    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    /**
     *
     * @param productDescription
     *     The productDescription
     */
    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     *
     * @return
     *     The reasonForRecall
     */
    @JsonProperty("reasonForRecall")
    public String getReasonForRecall() {
        return reasonForRecall;
    }

    /**
     *
     * @param reasonForRecall
     *     The reasonForRecall
     */
    @JsonProperty("reasonForRecall")
    public void setReasonForRecall(String reasonForRecall) {
        this.reasonForRecall = reasonForRecall;
    }

    /**
     *
     * @return
     *     The recallInitiationDate
     */
    @JsonProperty("recallInitiationDate")
    public String getRecallInitiationDate() {
        return recallInitiationDate;
    }

    /**
     *
     * @param recallInitiationDate
     *     The recallInitiationDate
     */
    @JsonProperty("recallInitiationDate")
    public void setRecallInitiationDate(String recallInitiationDate) {
        this.recallInitiationDate = recallInitiationDate;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(reportDate).append(recallingFirm).append(productDescription).append(reasonForRecall).append(recallInitiationDate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FDAEnforcementReportResult) == false) {
            return false;
        }
        FDAEnforcementReportResult rhs = ((FDAEnforcementReportResult) other);
        return new EqualsBuilder().append(reportDate, rhs.reportDate).append(recallingFirm, rhs.recallingFirm).append(productDescription, rhs.productDescription).append(reasonForRecall, rhs.reasonForRecall).append(recallInitiationDate, rhs.recallInitiationDate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
