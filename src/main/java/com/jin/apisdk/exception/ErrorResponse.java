package com.jin.apisdk.exception;

import lombok.Data;

/**
 * @author jin
 * @Version: 1.0
 * @Description:
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
