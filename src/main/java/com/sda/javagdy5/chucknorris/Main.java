package com.sda.javagdy5.chucknorris;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://api.chucknorris.io/jokes/random";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


        //JokeDownloader jokeDownloader = new OldSchoolJokeDownloader(objectMapper);
        //JokeDownloader jokeDownloader = new ApacheJokeDownloader(objectMapper);
        JokeDownloader jokeDownloader = new Java11JokeDownloader(objectMapper);

        Set<String> jokeIds = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            Joke joke = jokeDownloader.download(url);
            if (jokeIds.contains(joke.getId())) {
                System.out.println("WARNING: Już taki kawał pobraliśmy");
            } else {
                System.out.println("id:=" + joke.getId() + " treść: " + joke.getContent());
                jokeIds.add(joke.getId());
            }
        }
    }
}
