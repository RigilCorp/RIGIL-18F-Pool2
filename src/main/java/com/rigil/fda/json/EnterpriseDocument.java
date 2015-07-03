
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

/**
 * Enterprise Document Base Schema. NOTE: This schema can be extended to include any JSON compliant schemas within request and response elements that are part of the DocumentBody element.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "enterpriseDocument"
})
public class EnterpriseDocument {

    @JsonProperty("enterpriseDocument")
    private EnterpriseDocument_ enterpriseDocument;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The enterpriseDocument
     */
    @JsonProperty("enterpriseDocument")
    public EnterpriseDocument_ getEnterpriseDocument() {
        return enterpriseDocument;
    }

    /**
     *
     * @param enterpriseDocument
     *     The enterpriseDocument
     */
    @JsonProperty("enterpriseDocument")
    public void setEnterpriseDocument(EnterpriseDocument_ enterpriseDocument) {
        this.enterpriseDocument = enterpriseDocument;
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
        return new HashCodeBuilder().append(enterpriseDocument).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnterpriseDocument) == false) {
            return false;
        }
        EnterpriseDocument rhs = ((EnterpriseDocument) other);
        return new EqualsBuilder().append(enterpriseDocument, rhs.enterpriseDocument).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
