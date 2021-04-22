package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qyf
 * @create 2021-04-14-12:39 上午
 */
@RestController
@RequestMapping("/sso")
public class MemberController {
    @PostMapping("/getOptCode")
    public CommonResult getOtpCode(@RequestParam String telPhone){
        return null;
    }

}
