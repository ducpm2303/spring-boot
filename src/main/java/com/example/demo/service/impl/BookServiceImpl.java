package com.example.demo.service.impl;

import com.example.demo.entity.Book;
import com.example.demo.exception.BusinessCode;
import com.example.demo.exception.BusinessException;
import com.example.demo.mapper.BookMapper;
import com.example.demo.model.reponse.response.BookResponse;
import com.example.demo.model.request.request.CreatBookRequest;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@Service
@Log4j2
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public BookResponse save(CreatBookRequest request) {
        Book book = bookMapper.to(request);
        return bookMapper.to(bookRepository.save(book));
    }

    @Override
    public BookResponse findId(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                () -> new BusinessException(BusinessCode.NOT_FOUND_BOOK)
        );
        return bookMapper.to(book);
    }
}
