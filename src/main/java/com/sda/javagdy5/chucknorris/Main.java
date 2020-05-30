package com.sda.javagdy5.chucknorris;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://api.chucknorris.io/jokes/random";
        JokeDownloader jokeDownloader = new Java11JokeDownloader();

        for (int i = 0; i < 10; i++) {
            Joke joke = jokeDownloader.download(url);
            System.out.println(joke.getContent());
        }
    }
}
