
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "searchRequest"
})
public class RequestMessage {

    /**
     * Search Request Details
     *
     */
    @JsonProperty("searchRequest")
    private SearchRequest searchRequest;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * searchRequest Request Details
     *
     * @return
     *     The searchRequest
     */
    @JsonProperty("searchRequest")
    public SearchRequest getSearchRequest() {
        return searchRequest;
    }

    /**
     * searchRequest Details
     *
     * @param searchRequest
     *     The searchRequest
     */
    @JsonProperty("searchRequest")
    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
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
        return new HashCodeBuilder().append(searchRequest).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestMessage) == false) {
            return false;
        }
        RequestMessage rhs = ((RequestMessage) other);
        return new EqualsBuilder().append(searchRequest, rhs.searchRequest).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
