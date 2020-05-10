package com.example.moviecentral.network.responses;


public class ApiResponse<T> {

    public class ApiSuccessResponse<T> extends ApiResponse<T> { // api success
        private T body;

        ApiSuccessResponse(T body) {
            this.body = body;
        }

        public T getBody() {
            return body;
        }
    }

    public class ApiErrorResponse<T> extends ApiResponse<T> { // api error

        private String errorMessage;

        ApiErrorResponse(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

    }

    public class ApiEmptyResponse<T> extends ApiResponse<T> { // api return empty

    }

}
