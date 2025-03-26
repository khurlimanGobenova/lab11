package com.example.lab11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/services")
    public String services() {
        return "<h2>Our Services</h2>" +
                "<ul>" +
                "<li>Web Development</li>" +
                "<li>Mobile App Development</li>" +
                "<li>UX/UI design</li>" +
                "</ul>";
    }

    @GetMapping("/about")
    public String about() {
        return "This application was created as a part of a WEB programming course.";
    }

    @GetMapping("/faq")
    public String faq() {
        return "<h2>Frequently Asked Questions</h2>" +
                "<p>Q: What do you have to offer?</p>" +
                "<p>A: We provide web development, mobile app development and ......</p>";
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "Contact us at: dontemailus@company.com";
    }

    @GetMapping("/team")
    public String team() {
        return "<h2>Our Team</h2>" +
                "<p>Anne Kat - CEO</p>" +
                "<p>Lizzy Mug - CTO</p>";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }

    @GetMapping("/double/{num}")
    public String doubleValue(@PathVariable int num) {
        return "Twice of " + num + " is " + (num * 2) + ".";
    }

    @GetMapping("/length/{text}")
    public String length(@PathVariable String text) {
        return "The length of " + text+ " is " + text.length() + ".";
    }

    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text) {
        return "The reverse of " +  text + " is "  + new StringBuilder(text).reverse().toString();
    }

    @GetMapping("/concat/{str1}/{str2}")
    public String concat(@PathVariable String str1, @PathVariable String str2) {
        return "The concatenation of " + str1 + " and " + str2 + " is " + ( str1 + str2);
    }
    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + ".";
    }
    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + ".";
    }
    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference of " + x + " and " + y + " is " + (x - y);
    }
    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        return "The division of " + x + " and " + y + " is " + (x / y);
    }
    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        return "The remainder when " + x + " is divided by " + y + " is " + (x % y);
    }
    @GetMapping("/modulus/{x}/{y}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        return "The power " + exp + " of " + base + " is " + Math.pow(base,exp);
    }

}
