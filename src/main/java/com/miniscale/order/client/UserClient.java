package com.miniscale.order.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class UserClient {

    private final WebClient client = WebClient.create("http://user-service:8080");

    public String fetchUser(String id) {
        return client.get()
                .uri("/users/" + id)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
