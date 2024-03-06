package com.jin.apisdk.model.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jzy
 * @GitHub <a href="https://github.com/567jin">567jin</a>
 * @since 2024-02-26 10:47:21
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class PoetParam implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 是否拼接成完整的一首诗 默认false
     */

//    private Boolean isPoem;
    /**
     * 一次最多请求的诗句
     */
    private int poets = 20;

    /**
     * 作者
     */
    private String author;
    /**
     * 朝代
     */
    private String dynasty;
    /**
     * 题目
     */
    private String title;
    /**
     * 具体古诗
     */
    private String poetry;
}
