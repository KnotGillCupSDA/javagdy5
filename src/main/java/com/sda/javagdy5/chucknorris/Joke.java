package com.sda.javagdy5.chucknorris;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Joke {

    private final String content;

    @JsonCreator
    public Joke(@JsonProperty("value") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
