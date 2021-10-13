package com.example.demo.model.reponse.response;

import lombok.Data;


@Data
public class SubCategoryResponse {
    private Long id;
    private String code;
    private String name;
    private Long category_id;
}
