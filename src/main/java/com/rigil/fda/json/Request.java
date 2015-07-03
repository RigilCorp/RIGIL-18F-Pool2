
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
 * Request Data that also can refer to another JSON (schema) definition
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "requestMethod",
    "requestCriteria",
    "requestMessage"
})
public class Request {

    /**
     * GET|PUT|UPDATE|DELETE
     *
     */
    @JsonProperty("requestMethod")
    private String requestMethod;
    /**
     * Criteria to be used for this request. {ALL, element1,element2,...}. NOTE: 'ALL' criteria can be only used for UPDATE or INSERT operations.
     *
     */
    @JsonProperty("requestCriteria")
    private String requestCriteria;
    @JsonProperty("requestMessage")
    private RequestMessage requestMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * GET|PUT|UPDATE|DELETE
     *
     * @return
     *     The requestMethod
     */
    @JsonProperty("requestMethod")
    public String getRequestMethod() {
        return requestMethod;
    }

    /**
     * GET|PUT|UPDATE|DELETE
     *
     * @param requestMethod
     *     The requestMethod
     */
    @JsonProperty("requestMethod")
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    /**
     * Criteria to be used for this request. {ALL, element1,element2,...}. NOTE: 'ALL' criteria can be only used for UPDATE or INSERT operations.
     *
     * @return
     *     The requestCriteria
     */
    @JsonProperty("requestCriteria")
    public String getRequestCriteria() {
        return requestCriteria;
    }

    /**
     * Criteria to be used for this request. {ALL, element1,element2,...}. NOTE: 'ALL' criteria can be only used for UPDATE or INSERT operations.
     *
     * @param requestCriteria
     *     The requestCriteria
     */
    @JsonProperty("requestCriteria")
    public void setRequestCriteria(String requestCriteria) {
        this.requestCriteria = requestCriteria;
    }

    /**
     *
     * @return
     *     The requestMessage
     */
    @JsonProperty("requestMessage")
    public RequestMessage getRequestMessage() {
        return requestMessage;
    }

    /**
     *
     * @param requestMessage
     *     The requestMessage
     */
    @JsonProperty("requestMessage")
    public void setRequestMessage(RequestMessage requestMessage) {
        this.requestMessage = requestMessage;
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
        return new HashCodeBuilder().append(requestMethod).append(requestCriteria).append(requestMessage).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Request) == false) {
            return false;
        }
        Request rhs = ((Request) other);
        return new EqualsBuilder().append(requestMethod, rhs.requestMethod).append(requestCriteria, rhs.requestCriteria).append(requestMessage, rhs.requestMessage).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
