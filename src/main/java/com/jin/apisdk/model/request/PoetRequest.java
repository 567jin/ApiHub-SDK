package com.jin.apisdk.model.request;


import com.jin.apisdk.model.enums.RequestMethodEnum;
import com.jin.apisdk.model.params.PoetParam;
import com.jin.apisdk.model.response.NameResponse;
import com.jin.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author jin
 * @Description: 获取古诗
 */
@Accessors(chain = true)
public class PoetRequest extends BaseRequest<PoetParam, ResultResponse> {

    @Override
    public String getPath() {
        return "/poet";
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
