package com.example.demo.controller;

import com.example.demo.model.BaseResponse;
import com.example.demo.model.reponse.response.BookResponse;
import com.example.demo.model.request.request.CreatBookRequest;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("public-api/v1.0.0/book")
public class BookController {

    private final BookService bookService;


    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public BaseResponse<BookResponse> createBook(@RequestBody CreatBookRequest request){
        return BaseResponse.ofSuccess(bookService.save(request));
    }

    @GetMapping("{id}")
    public BaseResponse<BookResponse> findById(@PathVariable Long id){
        return BaseResponse.ofSuccess(bookService.findId(id));
    }

}
