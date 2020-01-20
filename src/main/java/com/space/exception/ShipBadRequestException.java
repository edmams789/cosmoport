package com.space.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ShipBadRequestException extends RuntimeException {
    public ShipBadRequestException() {
        super("BADREQUEST");
    }
}
