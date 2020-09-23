package com.fluim.tencentflutterdemo.controller;

import com.fluim.tencentflutterdemo.service.UserSigService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 腾讯Im 获取UserSig
 * author gwsh<shundong106@gmail.com>
 */
@RestController
public class UserSigController {
    @Resource
    private UserSigService _service;


    @GetMapping("/getUserSig")
    public String getUserSig(String userid) {
        return _service.generateUserSig(userid);
    }
}
