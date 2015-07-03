
package com.rigil.fda.json;

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
    "documentServiceId",
    "documentBusinessHeader"
})
public class DocumentHeader {

    /**
     * Unique identifier for a specific exchange
     * 
     */
    @JsonProperty("documentServiceId")
    private String documentServiceId;
    /**
     * Application specific data
     * 
     */
    @JsonProperty("documentBusinessHeader")
    private String documentBusinessHeader;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Unique identifier for a specific exchange
     * 
     * @return
     *     The documentServiceId
     */
    @JsonProperty("documentServiceId")
    public String getDocumentServiceId() {
        return documentServiceId;
    }

    /**
     * Unique identifier for a specific exchange
     * 
     * @param documentServiceId
     *     The documentServiceId
     */
    @JsonProperty("documentServiceId")
    public void setDocumentServiceId(String documentServiceId) {
        this.documentServiceId = documentServiceId;
    }

    /**
     * Application specific data
     * 
     * @return
     *     The documentBusinessHeader
     */
    @JsonProperty("documentBusinessHeader")
    public String getDocumentBusinessHeader() {
        return documentBusinessHeader;
    }

    /**
     * Application specific data
     * 
     * @param documentBusinessHeader
     *     The documentBusinessHeader
     */
    @JsonProperty("documentBusinessHeader")
    public void setDocumentBusinessHeader(String documentBusinessHeader) {
        this.documentBusinessHeader = documentBusinessHeader;
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
        return new HashCodeBuilder().append(documentServiceId).append(documentBusinessHeader).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentHeader) == false) {
            return false;
        }
        DocumentHeader rhs = ((DocumentHeader) other);
        return new EqualsBuilder().append(documentServiceId, rhs.documentServiceId).append(documentBusinessHeader, rhs.documentBusinessHeader).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
