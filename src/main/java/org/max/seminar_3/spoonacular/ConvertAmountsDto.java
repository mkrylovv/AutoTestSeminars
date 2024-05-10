package org.max.seminar_3.spoonacular;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sourceAmount",
        "sourceUnit",
        "targetAmount",
        "targetUnit",
        "answer",
        "type"
})
public class ConvertAmountsDto {

    @JsonProperty("sourceAmount")
    private Double sourceAmount;
    @JsonProperty("sourceUnit")
    private String sourceUnit;
    @JsonProperty("targetAmount")
    private Double targetAmount;
    @JsonProperty("targetUnit")
    private String targetUnit;
    @JsonProperty("answer")
    private String answer;
    @JsonProperty("type")
    private String type;

    @JsonProperty("sourceAmount")
    public Double getSourceAmount() {
        return sourceAmount;
    }

    @JsonProperty("sourceAmount")
    public void setSourceAmount(Double sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    @JsonProperty("sourceUnit")
    public String getSourceUnit() {
        return sourceUnit;
    }

    @JsonProperty("sourceUnit")
    public void setSourceUnit(String sourceUnit) {
        this.sourceUnit = sourceUnit;
    }

    @JsonProperty("targetAmount")
    public Double getTargetAmount() {
        return targetAmount;
    }

    @JsonProperty("targetAmount")
    public void setTargetAmount(Double targetAmount) {
        this.targetAmount = targetAmount;
    }

    @JsonProperty("targetUnit")
    public String getTargetUnit() {
        return targetUnit;
    }

    @JsonProperty("targetUnit")
    public void setTargetUnit(String targetUnit) {
        this.targetUnit = targetUnit;
    }

    @JsonProperty("answer")
    public String getAnswer() {
        return answer;
    }

    @JsonProperty("answer")
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

}
