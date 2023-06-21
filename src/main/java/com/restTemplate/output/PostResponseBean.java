package com.restTemplate.output;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class PostResponseBean {

    @JsonProperty("Message")
    private String Message;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("PostOffice")
    private List<PostOfficeDetails> postOffice;
}
