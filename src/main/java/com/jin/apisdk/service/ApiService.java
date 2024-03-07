package com.jin.apisdk.service;

import cn.hutool.http.HttpResponse;
import com.jin.apisdk.client.ApiClient;
import com.jin.apisdk.exception.ApiException;
import com.jin.apisdk.model.request.*;
import com.jin.apisdk.model.response.*;


/**
 * @author jin
 * @Description:
 */
public interface ApiService {
    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */

    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param apiClient apiHub客户端
     * @param request   要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(ApiClient apiClient, BaseRequest<O, T> request) throws ApiException;


    /**
     * 随机毒鸡汤
     *
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException;

    /**
     * 喝毒鸡汤
     *
     * @param apiClient qi api客户端
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup(ApiClient apiClient) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param request 要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param apiClient qi api客户端
     * @param request   要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(ApiClient apiClient, RandomWallpaperRequest request) throws ApiException;

    /**
     * 随意情话
     *
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk() throws ApiException;

    /**
     * 随意情话
     *
     * @param apiClient apiHub客户端
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk(ApiClient apiClient) throws ApiException;

    /**
     * 星座运势
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(HoroscopeRequest request) throws ApiException;

    /**
     * 星座运势
     *
     * @param apiClient apiHub客户端
     * @param request   要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(ApiClient apiClient, HoroscopeRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param apiClient apiHub客户端
     * @param request   要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(ApiClient apiClient, IpInfoRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(IpInfoRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param apiClient apiHub客户端
     * @param request   要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(ApiClient apiClient, WeatherRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException;

    /**
     * 获取一句古寺
     *
     * @param apiClient apiHub客户端
     * @param request   要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getPoet(ApiClient apiClient, PoetRequest request) throws ApiException;

    /**
     * 获取一句古诗
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getPoet(PoetRequest request) throws ApiException;


    /**
     * 获取随机狗狗图片
     *
     * @param apiClient api客户端
     * @param request   要求
     * @return {@link RandomDogResponse}
     * @throws ApiException 业务异常
     */
    RandomDogResponse getRandomDog(ApiClient apiClient, RandomDogRequest request) throws ApiException;

    /**
     * 获取随机狗狗图片
     *
     * @param request 要求
     * @return {@link RandomDogResponse}
     * @throws ApiException 业务异常
     */
    RandomDogResponse getRandomDog(RandomDogRequest request) throws ApiException;

    /**
     * 获取随机猫猫图片
     *
     * @param apiClient api客户端
     * @param request   要求
     * @return {@link RandomDogResponse}
     * @throws ApiException 业务异常
     */
    RandomCatResponse getRandomCat(ApiClient apiClient, RandomCatRequest request) throws ApiException;

    /**
     * 获取随机猫猫图片
     *
     * @param request 要求
     * @return {@link RandomDogResponse}
     * @throws ApiException 业务异常
     */
    RandomCatResponse getRandomCat(RandomCatRequest request) throws ApiException;


    /**
     * 获取随机二次元图片
     *
     * @param apiClient api客户端
     * @param request   要求
     * @return {@link RandomDogResponse}
     * @throws ApiException 业务异常
     */
    RandomAcgResponse getRandomACG(ApiClient apiClient, RandomAcgRequest request) throws ApiException;

    /**
     * 获取随机二次元图片
     *
     * @param request 要求
     * @return {@link RandomDogResponse}
     * @throws ApiException 业务异常
     */
    RandomAcgResponse getRandomACG(RandomAcgRequest request) throws ApiException;

}
