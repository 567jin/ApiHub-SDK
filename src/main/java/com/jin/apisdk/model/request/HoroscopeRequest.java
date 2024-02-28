package com.jin.apisdk.model.request;


import com.jin.apisdk.model.enums.RequestMethodEnum;
import com.jin.apisdk.model.params.HoroscopeParams;
import com.jin.apisdk.model.response.NameResponse;
import com.jin.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author jin
 * @Version: 1.0
 * @Description: 随机情话
 */
@Accessors(chain = true)
public class HoroscopeRequest extends BaseRequest<HoroscopeParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/horoscope";
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
