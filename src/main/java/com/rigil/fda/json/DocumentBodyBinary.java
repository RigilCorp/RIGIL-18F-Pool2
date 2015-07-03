
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
    "BinaryObject.Base64",
    "BinaryTypeText",
    "BinaryMimeType"
})
public class DocumentBodyBinary {

    @JsonProperty("BinaryObject.Base64")
    private String BinaryObjectBase64;
    @JsonProperty("BinaryTypeText")
    private String BinaryTypeText;
    @JsonProperty("BinaryMimeType")
    private String BinaryMimeType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The BinaryObjectBase64
     */
    @JsonProperty("BinaryObject.Base64")
    public String getBinaryObjectBase64() {
        return BinaryObjectBase64;
    }

    /**
     * 
     * @param BinaryObjectBase64
     *     The BinaryObject.Base64
     */
    @JsonProperty("BinaryObject.Base64")
    public void setBinaryObjectBase64(String BinaryObjectBase64) {
        this.BinaryObjectBase64 = BinaryObjectBase64;
    }

    /**
     * 
     * @return
     *     The BinaryTypeText
     */
    @JsonProperty("BinaryTypeText")
    public String getBinaryTypeText() {
        return BinaryTypeText;
    }

    /**
     * 
     * @param BinaryTypeText
     *     The BinaryTypeText
     */
    @JsonProperty("BinaryTypeText")
    public void setBinaryTypeText(String BinaryTypeText) {
        this.BinaryTypeText = BinaryTypeText;
    }

    /**
     * 
     * @return
     *     The BinaryMimeType
     */
    @JsonProperty("BinaryMimeType")
    public String getBinaryMimeType() {
        return BinaryMimeType;
    }

    /**
     * 
     * @param BinaryMimeType
     *     The BinaryMimeType
     */
    @JsonProperty("BinaryMimeType")
    public void setBinaryMimeType(String BinaryMimeType) {
        this.BinaryMimeType = BinaryMimeType;
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
        return new HashCodeBuilder().append(BinaryObjectBase64).append(BinaryTypeText).append(BinaryMimeType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentBodyBinary) == false) {
            return false;
        }
        DocumentBodyBinary rhs = ((DocumentBodyBinary) other);
        return new EqualsBuilder().append(BinaryObjectBase64, rhs.BinaryObjectBase64).append(BinaryTypeText, rhs.BinaryTypeText).append(BinaryMimeType, rhs.BinaryMimeType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
