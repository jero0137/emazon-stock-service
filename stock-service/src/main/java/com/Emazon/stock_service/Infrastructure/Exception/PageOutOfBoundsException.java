package com.Emazon.stock_service.Infrastructure.Exception;

public class PageOutOfBoundsException extends RuntimeException {
    public PageOutOfBoundsException(String message) {
        super(message);
    }
}