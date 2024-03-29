package com.jin.apisdk.model.request;


import com.jin.apisdk.model.enums.RequestMethodEnum;
import com.jin.apisdk.model.params.RandomWallpaperParams;
import com.jin.apisdk.model.response.RandomWallpaperResponse;
import com.jin.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author jin
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
