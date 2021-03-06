package com.sda.javagdy5.chucknorris;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java11JokeDownloader implements JokeDownloader {

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public Java11JokeDownloader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        httpClient = HttpClient.newHttpClient();
    }

    @Override
    public Joke download(String url) throws IOException {

        try {

            HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create(url))
            .build();

            HttpResponse<String> response = httpClient.send(request,
                HttpResponse.BodyHandlers.ofString());

            return objectMapper.readValue(response.body(), Joke.class);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
            return null;
        }
    }
}
