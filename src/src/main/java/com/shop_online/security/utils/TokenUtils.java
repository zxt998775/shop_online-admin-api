package com.shop_online.security.utils;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.StrUtil;

import javax.servlet.http.HttpServletRequest;


/**
 * @author sunyu
 */
public class TokenUtils {

     
    /**
     * 生成 AccessToken
     */
    public static String generator() {
        return UUID.fastUUID().toString(true);
    }

    /**
     * 获取 AccessToken
     */
    public static String getAccessToken(HttpServletRequest request) {
        String accessToken = request.getHeader("Authorization");
        if (StrUtil.isBlank(accessToken)) {
            accessToken = request.getParameter("access_token");
        }

        return accessToken;
    }
}
