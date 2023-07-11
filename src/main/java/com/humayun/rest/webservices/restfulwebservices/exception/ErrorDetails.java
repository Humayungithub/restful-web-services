package com.humayun.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    //timestamp
    private LocalDateTime timestamp;
    //message
    private String message;
    //details
    private String details;
    //Constructors
    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    //Getter
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
