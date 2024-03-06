package com.jin.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author jzy
 * @GitHub <a href="https://github.com/567jin">567jin</a>
 * @since 2024-03-05 16:13:14
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AcgResponse extends ResultResponse {
    private static final long serialVersionUID = -5467312483425058539L;
    private String imgurl;
    private int width;
    private int height;
    private String type;
}
