package com.example.demo.exception;

import org.springframework.http.HttpStatus;

public class BusinessCode {

    private BusinessCode() {
    }

    public static final ErrorResponse SUCCESS =
            new ErrorResponse("SUCCESS-01", "SUCCESS", HttpStatus.OK);

    public static final ErrorResponse INTERNAL_SERVER =
            new ErrorResponse("INTERNAL-SERVER", "Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);

    public static final ErrorResponse NOT_FOUND_USER =
            new ErrorResponse("NOT-FOUND-USER", "Not found user with id", HttpStatus.BAD_REQUEST);

    public static final ErrorResponse NOT_FOUND_BOOK =
            new ErrorResponse("NOT-FOUND-BOOK", "Not found user with id", HttpStatus.BAD_REQUEST);

    public static final ErrorResponse NOT_FOUND_ACCOUNT =
            new ErrorResponse("NOT-FOUND-ACCOUNT", "Not found account with id", HttpStatus.BAD_REQUEST);
}
