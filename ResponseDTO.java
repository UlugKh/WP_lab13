package com.wp.lab13;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class ResponseDTO<T> {

    @JsonProperty("message")
    private String message;

    @JsonProperty("status_code")
    private int status;

    @JsonProperty("timestamp")
    private LocalDateTime timestamp;

    @JsonProperty("data")
    private T data;

    public ResponseDTO(String message, int status, T data) {
        this.message = message;
        this.status = status;
        this.timestamp = LocalDateTime.now();
        this.data = data;
    }

    // Getters
    public String getMessage() { return message; }
    public int getStatus() { return status; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public T getData() { return data; }
}

