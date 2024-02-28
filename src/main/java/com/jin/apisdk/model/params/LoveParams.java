package com.jin.apisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author jin
 * @Version: 1.0
 * @Description: 随机一句情话
 */
@Data
@Accessors(chain = true)
public class LoveParams implements Serializable {
    private static final long serialVersionUID = 3815188540434269370L;
}
