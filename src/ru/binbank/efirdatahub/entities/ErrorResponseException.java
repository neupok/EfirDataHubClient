package ru.binbank.efirdatahub.entities;

public class ErrorResponseException extends Exception {

    private ErrorTableResponse errorResponse;

    public void ErrorResponseException() {
    }

    public void ErrorResponseException(ErrorTableResponse errorTableResponse) {
        this.errorResponse = errorTableResponse;
    }

    public ErrorTableResponse getErrorResponse() {
        return errorResponse;
    }

}
