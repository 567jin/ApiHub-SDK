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
     * id没用 不应该传递id 是随机获取诗词的 在后面查询时 id会随机生成
     */
    private Long id;
}
