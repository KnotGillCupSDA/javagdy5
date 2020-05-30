package com.sda.javagdy5.chucknorris;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class ApacheJokeDownloader implements JokeDownloader {

    private final ObjectMapper objectMapper;

    public ApacheJokeDownloader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public Joke download(String url) throws IOException {
        HttpUriRequest request = RequestBuilder.get()
            .setUri(url)
            .addHeader("User-Agent", "Chrome")
            .build();
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                return objectMapper.readValue(response.getEntity().getContent(), Joke.class);
            }
        }
    }
}
