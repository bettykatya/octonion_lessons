package com.octonion.automation_lessons.api;

//import org.apache.http.client.HttpClient;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class ApiTest {

    @Test
    public void verifyGetWeatherRequest() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://community-open-weather-map.p.rapidapi.com/weather?q=London%2Cuk&id=2172797&lang=ru&units=metric"))
                .header("x-rapidapi-key", "daed4774fdmsh887eddf2526981cp1145e7jsnd315f2cd90ce")
                .header("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
