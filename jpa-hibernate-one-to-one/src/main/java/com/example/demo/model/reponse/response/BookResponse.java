package com.example.demo.model.reponse.response;

import lombok.Data;

@Data
public class BookResponse {
    private Long id;
    private String title;
    private String author;
    private float price;
}
