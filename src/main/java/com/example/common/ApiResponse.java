package com.example.common;

import com.example.enums.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author naihe
 * @date 2024/05/15 ❤ 下午 09:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {

    /**
     * Response Code
     */
    private int code;

    /**
     * Response Message
     */
    private String message;

    /**
     * Response Data
     */
    private T data;

    public static <T> ApiResponse<T> ok() {
        return new ApiResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getResponseText(), null);
    }

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getResponseText(), data);
    }

    public static <T> ApiResponse<T> ok(String message, T data) {
        return new ApiResponse<>(ResponseCode.SUCCESS.getCode(), message, data);
    }

    public static <T> ApiResponse<T> error() {
        return new ApiResponse<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getResponseText(), null);
    }

    public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<>(ResponseCode.ERROR.getCode(), message, null);
    }

    public static <T> ApiResponse<T> of(ResponseCode code, T data) {
        return new ApiResponse<>(code.getCode(), code.getResponseText(), data);
    }

    public static <T> ApiResponse<T> of(ResponseCode code, String message, T data) {
        return new ApiResponse<>(code.getCode(), message, data);
    }

    public ApiResponse<T> message(String message) {
        this.message = message;
        return this;
    }

    public ApiResponse<T> data(T data) {
        this.data = data;
        return this;
    }
}
