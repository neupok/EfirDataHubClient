package ru.binbank.efirdatahub.entities.infoservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"FaceValue","Error"})
public class ResidualFaceValueResponse {
    @JsonProperty("FaceValue")
    private long faceValue;
    @JsonProperty("Error")
    private String error;

    @JsonProperty("FaceValue")
    public long getFaceValue() {
        return faceValue;
    }
    @JsonProperty("FaceValue")
    public void setFaceValue(long faceValue) {
        this.faceValue = faceValue;
    }

    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }

}
