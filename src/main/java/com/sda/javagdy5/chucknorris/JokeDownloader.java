package com.sda.javagdy5.chucknorris;

import java.io.IOException;

public interface JokeDownloader {
    Joke download(String url) throws IOException;
}
