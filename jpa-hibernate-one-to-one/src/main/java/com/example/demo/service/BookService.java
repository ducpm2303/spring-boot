package com.example.demo.service;

import com.example.demo.model.reponse.response.BookResponse;
import com.example.demo.model.request.request.CreatBookRequest;

public interface BookService {

    BookResponse save(CreatBookRequest request);

    BookResponse findId(Long id);

}
