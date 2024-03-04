package com.jin.apisdk.model.request;


import com.jin.apisdk.model.enums.RequestMethodEnum;
import com.jin.apisdk.model.params.RandomDogParams;
import com.jin.apisdk.model.params.RandomWallpaperParams;
import com.jin.apisdk.model.response.RandomDogResponse;
import com.jin.apisdk.model.response.RandomWallpaperResponse;
import com.jin.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author jin
 */
@Accessors(chain = true)
public class RandomDogRequest extends BaseRequest<RandomDogParams, RandomDogResponse> {
    @Override
    public String getPath() {
        return "/randomDog";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomDogResponse> getResponseClass() {
        return RandomDogResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
