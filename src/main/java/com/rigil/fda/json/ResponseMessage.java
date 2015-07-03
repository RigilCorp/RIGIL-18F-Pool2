
package com.rigil.fda.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "searchResponse"
    })
public class ResponseMessage {

    @JsonProperty("searchResponse")
    private List<FDAEnforcementReportResult> searchResponse;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    /**
    *
    * @return
    *     The searchResponse
    */
   @JsonProperty("searchResponse")
   public List<FDAEnforcementReportResult>  getSearchResponse() {
       return searchResponse;
   }

   /**
    *
    * @param searchResponse
    *     The searchResponse
    */
   @JsonProperty("searchResponse")
   public void setSearchResponse(List<FDAEnforcementReportResult>  searchResponse) {
       this.searchResponse = searchResponse;
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
        return new HashCodeBuilder().append(searchResponse).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseMessage) == false) {
            return false;
        }
        ResponseMessage rhs = ((ResponseMessage) other);
        return new EqualsBuilder().append(searchResponse, rhs.searchResponse).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
