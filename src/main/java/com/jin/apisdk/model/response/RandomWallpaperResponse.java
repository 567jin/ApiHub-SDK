package com.jin.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RandomWallpaperResponse extends ResultResponse {
    private static final long serialVersionUID = -6467312483425078539L;
    private String imgurl;
    private String status;
}
