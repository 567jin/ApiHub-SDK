package com.jin.apisdk.model.request;


import com.jin.apisdk.model.enums.RequestMethodEnum;
import com.jin.apisdk.model.params.RandomCatParams;
import com.jin.apisdk.model.params.RandomDogParams;
import com.jin.apisdk.model.response.RandomCatResponse;
import com.jin.apisdk.model.response.RandomDogResponse;
import com.jin.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author jin
 */
@Accessors(chain = true)
public class RandomCatRequest extends BaseRequest<RandomCatParams, RandomCatResponse> {
    @Override
    public String getPath() {
        return "/randomCat";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomCatResponse> getResponseClass() {
        return RandomCatResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
