package com.jin.apisdk.model.request;


import com.jin.apisdk.model.enums.RequestMethodEnum;
import com.jin.apisdk.model.params.RandomAcgParams;
import com.jin.apisdk.model.response.RandomAcgResponse;
import com.jin.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author jin
 */
@Accessors(chain = true)
public class RandomAcgRequest extends BaseRequest<RandomAcgParams, RandomAcgResponse> {
    @Override
    public String getPath() {
        return "/randomACG";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomAcgResponse> getResponseClass() {
        return RandomAcgResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
