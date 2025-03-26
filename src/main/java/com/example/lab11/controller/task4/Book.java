package com.example.lab11.controller.task4;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Puaro's adventures";
        this.author = "Agatha Christie";
        this.price = 15.00;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
