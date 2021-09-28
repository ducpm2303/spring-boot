package com.example.demo.model.request.request;

import lombok.Data;

@Data
public class CreatBookRequest {
    private String title;
    private String author;
    private float price;
}
