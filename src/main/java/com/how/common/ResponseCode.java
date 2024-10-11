package com.how.common;

import lombok.Getter;

/**
 * @author naihe
 * @date 2024/09/30 ❤ 下午 06:40
 */
@Getter
public enum ResponseCode {

    /**
     * Request Successful
     */
    SUCCESS(200, "The request was successful"),

    /**
     * Resource created
     */
    CREATED(201, "The request was created"),

    /**
     * Error Request
     */
    BAD_REQUEST(400, "This is not the right request"),

    /**
     * Request not authorized
     */
    UNAUTHORIZED(401, "This is an unauthorized request"),

    /**
     * Request credentials have expired
     */
    FORBIDDEN(403, "The request was forbidden"),

    /**
     * Request resource does not exist
     */
    NOT_FOUND(404, "The requested resource does not exist"),

    /**
     * Request method was error
     */
    ERROR_REQUEST_METHOD(405, "The requested method is not supported"),

    /**
     * Server error
     */
    ERROR(500, "Internal Server Error"),

    /**
     * Service is not open
     */
    CLOSED(503, "The server was closed");

    /**
     * Response Code
     */
    private final int code;

    /**
     * Response Message
     */
    private final String responseText;

    ResponseCode(int code, String responseText) {
        this.code = code;
        this.responseText = responseText;
    }
}
