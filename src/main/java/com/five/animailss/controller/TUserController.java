package com.five.animailss.controller;

import com.five.animailss.entity.TUser;
import com.five.animailss.service.TUserService;
import com.five.animailss.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animail")
@Api(value = "用户登录注册Controller",tags = "用户接口")
public class TUserController {

    @Autowired
    private TUserService tUserService;
    @ApiOperation("用户登录")
    @PostMapping("/login")
    public ResultBean login(@ApiParam(value = "输入用户手机号，密码") String phone, String password) {

        ResultBean bean = tUserService.login(phone, password);
        if (bean.getCode() == 0) {

        }
        return bean;
    }
    @ApiOperation("用户注册")
    @PostMapping("/addTUser")
    public ResultBean addTUser(@ApiParam(value = "输入需要注册的内容") TUser tUser) {

        return  tUserService.saveTUser(tUser);
    }
    @ApiOperation("修改密码")
    @PutMapping("/modifyTUser")
    public ResultBean midifyTUser(@ApiParam(value ="输入新密码") TUser tUser) {

        return tUserService.modifyTuser(tUser);
    }
}
