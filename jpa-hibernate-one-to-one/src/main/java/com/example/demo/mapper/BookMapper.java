package com.example.demo.mapper;

import com.example.demo.entity.Book;
import com.example.demo.model.reponse.response.BookResponse;
import com.example.demo.model.request.request.CreatBookRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BookMapper implements Mapper<Book>{
    public Book to(CreatBookRequest request){
        Book book = new Book();
        BeanUtils.copyProperties(request, book);
        return book;
    }

    public BookResponse to(Book book){
        BookResponse response = new BookResponse();
        BeanUtils.copyProperties(book, response);
        return response;
    }
}
