package com.sda.javagdy5.quiz;

import java.util.List;

public class Question {

    private final String content;
    private final List<String> answers;

    public Question(String content, List<String> answers) {
        this.content = content;
        this.answers = answers;
    }

    public String getContent() {
        return content;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
