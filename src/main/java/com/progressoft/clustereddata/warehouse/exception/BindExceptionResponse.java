package com.progressoft.clustereddata.warehouse.exception;

import java.util.Objects;

public class BindExceptionResponse{
    private String filedName;
    private String message;

    public BindExceptionResponse(String key, String value) {
        this.filedName = key;
        this.message = value;
    }

    public String getFiledName() {
        return filedName;
    }

    public void setFiledName(String filedName) {
        this.filedName = filedName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BindExceptionResponse that = (BindExceptionResponse) o;
        return Objects.equals(filedName, that.filedName) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filedName, message);
    }
}