package com.fluim.tencentflutterdemo.service;

import com.tencentyun.TLSSigAPIv2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * author<shundong106@gmail.com>
 */
@Service
public class UserSigService {
    @Value("${sdkAppId}")
    private long sdkAppId;
    @Value("${secretKey}")
    private String secretKey;
    /**
     * 过期时间 分钟为单位
     */
    private long expire = 60 * 60 * 24 * 7;


    public String generateUserSig(String userId) {
        if (userId == null || userId == "") {
            return "userId不能为空";
        }
        TLSSigAPIv2 api = new TLSSigAPIv2(sdkAppId, secretKey);

        return api.genSig(userId, expire);
    }
}
