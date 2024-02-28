package com.jin.apisdk.model.request;


import com.jin.apisdk.model.enums.RequestMethodEnum;
import com.jin.apisdk.model.params.IpInfoParams;
import com.jin.apisdk.model.response.NameResponse;
import com.jin.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author jin
 */
@Accessors(chain = true)
public class IpInfoRequest extends BaseRequest<IpInfoParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/ipInfo";
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
