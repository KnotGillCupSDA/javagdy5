package com.sda.javagdy5.chucknorris;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Joke {

    private final String content;
    private final String id;

    @JsonCreator
    public Joke(@JsonProperty("value") String content,
                @JsonProperty("id") String id) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public String getId() {
        return id;
    }
}
