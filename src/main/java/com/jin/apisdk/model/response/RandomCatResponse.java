package com.jin.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RandomCatResponse extends ResultResponse {
    private static final long serialVersionUID = -5467322483425078539L;
    private String id;
    private String imgurl;
    private int width;
    private int height;
    private String type;
}
