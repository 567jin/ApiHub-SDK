package com.jin.apisdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jin
 * @Description: apiHub客户端
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiClient {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

}
