package com.jin.apisdk.exception;

import lombok.Data;

/**
 * @author jin
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
