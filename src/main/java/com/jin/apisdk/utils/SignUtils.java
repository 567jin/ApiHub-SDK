package com.jin.apisdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;
import cn.hutool.crypto.digest.MD5;
import cn.hutool.json.JSONUtil;

/**
 * @author jzy
 * @since 2024-01-03 20:56:23
 */
public class SignUtils {
    /**
     * 生成签名
     *
     * @param body      请求头中的内容
     * @param secretKey 密钥
     * @return 根据内容 使用签名算法生成一串字符串 当做签名
     */
    public static String getSign(String body, String secretKey) {
        return MD5.create().digestHex(JSONUtil.toJsonStr(body) + '.' + secretKey);
    }
}

