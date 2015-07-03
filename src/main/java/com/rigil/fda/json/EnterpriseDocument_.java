
package com.rigil.fda.json;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
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
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "documentTimeStamp",
    "documentHeader",
    "documentBody",
    "documentBodyBinary",
    "documentError"
})
public class EnterpriseDocument_ {

    @JsonProperty("documentTimeStamp")
    private Date documentTimeStamp;
    /**
     * 
     */
    @JsonProperty("documentHeader")
    private DocumentHeader documentHeader;
    @JsonProperty("documentBody")
    private DocumentBody documentBody;
    /**
     * 
     */
    @JsonProperty("documentBodyBinary")
    private DocumentBodyBinary documentBodyBinary;
    /**
     * Error Message
     * 
     */
    @JsonProperty("documentError")
    private DocumentError documentError;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The documentTimeStamp
     */
    @JsonProperty("documentTimeStamp")
    public Date getDocumentTimeStamp() {
        return documentTimeStamp;
    }

    /**
     * 
     * @param documentTimeStamp
     *     The documentTimeStamp
     */
    @JsonProperty("documentTimeStamp")
    public void setDocumentTimeStamp(Date documentTimeStamp) {
        this.documentTimeStamp = documentTimeStamp;
    }

    /**
     * 
     * @return
     *     The documentHeader
     */
    @JsonProperty("documentHeader")
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * 
     * @param documentHeader
     *     The documentHeader
     */
    @JsonProperty("documentHeader")
    public void setDocumentHeader(DocumentHeader documentHeader) {
        this.documentHeader = documentHeader;
    }

    /**
     * 
     * @return
     *     The documentBody
     */
    @JsonProperty("documentBody")
    public DocumentBody getDocumentBody() {
        return documentBody;
    }

    /**
     * 
     * @param documentBody
     *     The documentBody
     */
    @JsonProperty("documentBody")
    public void setDocumentBody(DocumentBody documentBody) {
        this.documentBody = documentBody;
    }

    /**
     * 
     * @return
     *     The documentBodyBinary
     */
    @JsonProperty("documentBodyBinary")
    public DocumentBodyBinary getDocumentBodyBinary() {
        return documentBodyBinary;
    }

    /**
     * 
     * @param documentBodyBinary
     *     The documentBodyBinary
     */
    @JsonProperty("documentBodyBinary")
    public void setDocumentBodyBinary(DocumentBodyBinary documentBodyBinary) {
        this.documentBodyBinary = documentBodyBinary;
    }

    /**
     * Error Message
     * 
     * @return
     *     The documentError
     */
    @JsonProperty("documentError")
    public DocumentError getDocumentError() {
        return documentError;
    }

    /**
     * Error Message
     * 
     * @param documentError
     *     The documentError
     */
    @JsonProperty("documentError")
    public void setDocumentError(DocumentError documentError) {
        this.documentError = documentError;
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
        return new HashCodeBuilder().append(documentTimeStamp).append(documentHeader).append(documentBody).append(documentBodyBinary).append(documentError).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnterpriseDocument_) == false) {
            return false;
        }
        EnterpriseDocument_ rhs = ((EnterpriseDocument_) other);
        return new EqualsBuilder().append(documentTimeStamp, rhs.documentTimeStamp).append(documentHeader, rhs.documentHeader).append(documentBody, rhs.documentBody).append(documentBodyBinary, rhs.documentBodyBinary).append(documentError, rhs.documentError).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
