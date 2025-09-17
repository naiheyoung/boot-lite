package com.how.common;

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

    public static <T> ApiResponse<T> success() {
        return build(ResponseCode.SUCCESS, null);
    }

    public static <T> ApiResponse<T> success(ResponseCode responseCode, T data) {
        return build(responseCode.getCode(), responseCode.getResponseText(), data);
    }

    public static <T> ApiResponse<T> success(T data) {
        return build(ResponseCode.SUCCESS, data);
    }

    public static <T> ApiResponse<T> success(String message, T data) {
        return build(ResponseCode.SUCCESS.getCode(), message, data);
    }

    public static <T> ApiResponse<T> error() {
        return build(ResponseCode.ERROR, null);
    }

    public static <T> ApiResponse<T> error(String message) {
        return build(ResponseCode.ERROR.getCode(), message, null);
    }

    public static <T> ApiResponse<T> error(ResponseCode responseCode) {
        return build(responseCode.getCode(), responseCode.getResponseText(), null);
    }

    private static <T> ApiResponse<T> build(ResponseCode responseCode, T data) {
        return new ApiResponse<>(responseCode.getCode(), responseCode.getResponseText(), data);
    }

    public static <T> ApiResponse<T> build(int code, String message, T data) {
        return new ApiResponse<>(code, message, data);
    }

}
