package com.jin.apisdk.model.request;


import com.jin.apisdk.model.enums.RequestMethodEnum;
import com.jin.apisdk.model.params.RandomWallpaperParams;
import com.jin.apisdk.model.response.RandomWallpaperResponse;
import lombok.experimental.Accessors;

/**
 * @author jin
 * @Version: 1.0
 * @Description:
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
