package com.jin.apisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author jin
 * @Version: 1.0
 * @Description: 获取天气请求参数
 */
@Data
@Accessors(chain = true)
public class WeatherParams implements Serializable {
    private static final long serialVersionUID = 3815188540434269370L;
    private String ip;
    private String city;
    private String type;
}
