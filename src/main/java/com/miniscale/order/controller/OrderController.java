package com.miniscale.order.controller;

import com.miniscale.order.client.UserClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final UserClient userClient;

    public OrderController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/{id}")
    public String createOrder(@PathVariable String id) {
        String user = userClient.fetchUser(id);
        return "Order created for " + user;
    }
}
