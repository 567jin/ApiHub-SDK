package com.jin.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RandomAcgResponse extends ResultResponse {
    private static final long serialVersionUID = -5467312483425058539L;
    private String imgurl;
    private int width;
    private int height;
    private String type;
}
