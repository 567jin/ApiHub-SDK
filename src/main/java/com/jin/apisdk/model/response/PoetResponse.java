package com.jin.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PoetResponse extends ResultResponse {
    private static final long serialVersionUID = -1138984103811824271L;
    private String title;
    private String content;
    private String dynasty;
    private String author;
}
