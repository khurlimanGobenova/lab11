package com.example.lab11.controller.task5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class QueryController {
    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }
    @GetMapping("/calculate")
    public String calculate(
            @RequestParam double x,
            @RequestParam double y,
            @RequestParam String operation) {
        return switch (operation) {
            case "add" -> "Result: " + (x + y);
            case "subtract" -> "Result: " + (x - y);
            case "multiply" -> "Result: " + (x * y);
            case "divide" -> "Result: " + (x / y);
            case "modulus" -> "Result: " + (x%y);
            default -> "Invalid operation";
        };
    }
    @GetMapping("/filter")
    public List<String> filter(
            @RequestParam(name = "keyword", required = false) String keyword,
            @RequestParam(name = "category", required = false) String category
    ) {
        List<String> items = Arrays.asList(
                "Electronics - Laptop",
                "Books - Programming",
                "Clothing - T-shirt",
                "Electronics - Smartphone",
                "Books - Fiction"
        );

        return items.stream()
                .filter(item -> (keyword == null || item.toLowerCase().contains(keyword.toLowerCase())))
                .filter(item -> (category == null || item.toLowerCase().startsWith(category.toLowerCase())))
                .collect(Collectors.toList());
    }

    @GetMapping("/convert")
    public String convertTemperature(@RequestParam double temperature) {
        double fahrenheit = (temperature * 9/5) + 32;
        return temperature + "°C = " + fahrenheit + "°F";
    }
    @GetMapping("/discount")
    public String calculateDiscount(@RequestParam double originalPrice, @RequestParam double discountRate) {
        double discountedPrice = originalPrice * (1 - discountRate/100);
        return "Original price: $" + originalPrice + ", Discounted price: $" + discountedPrice;
    }
}