package com.jin.apisdk.model.request;


import com.jin.apisdk.model.enums.RequestMethodEnum;
import com.jin.apisdk.model.params.WeatherParams;
import com.jin.apisdk.model.response.NameResponse;
import com.jin.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author jin
 * @Version: 1.0
 * @Description: 获取天气请求
 */
@Accessors(chain = true)
public class WeatherRequest extends BaseRequest<WeatherParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/weather";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
