package com.jin.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jzy
 * @GitHub <a href="https://github.com/567jin">567jin</a>
 * @since 2024-03-05 15:46:09
 * 统一图像响应结果
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ImageResponse extends ResultResponse {
    private static final long serialVersionUID = -6467312483425068539L;
    private String imgurl;
    private String status;
    private String width;
    private String height;
    private String fileType;
}
