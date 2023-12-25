package com.example.lab11.controller;

import com.example.lab11.dto.OrderDto;
import com.example.lab11.dto.OrderDtoShow;
import com.example.lab11.entity.OrderEntity;
import com.example.lab11.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody OrderDto orderDto) {
        OrderEntity createdOrder = orderService.createOrder(orderDto);
        return ResponseEntity.ok("Order created with ID: " + createdOrder.getId());
    }

    @GetMapping("/{orderId}")
    public ResponseEntity showOrder(@PathVariable Long orderId){
        OrderDtoShow orderDto = orderService.showOrder(orderId);
        return ResponseEntity.ok(orderDto);
    }
}
