package com.five.animailss.controller;

import com.five.animailss.entity.TUserinfo;
import com.five.animailss.service.TUserinfoService;
import com.five.animailss.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "用户信息Controller" ,tags = "用户信息模板接口")
@RestController
@RequestMapping("/animail")
public class TUserinfoController {

    @Autowired
    private TUserinfoService tUserinfoService;

    @ApiOperation("添加用户的信息")
    @PostMapping("/addTUserinfo")
    public ResultBean addInfo(@ApiParam(value = "输入用户的信息") TUserinfo info) {

        return tUserinfoService.saveInfo(info);
    }
    @ApiOperation("修改用户信息")
    @PutMapping("/modifyTUserinfo")
    public ResultBean modifyInfo(@ApiParam(value = "输入需要修改的信息") TUserinfo info) {
        return tUserinfoService.modifyInfo(info);
    }
    @ApiOperation("根据登录的uid展示用户的信息")
    @GetMapping("/queryInfoByUid")
    public ResultBean queryinfo(@ApiParam(value = "传入用户信息的uid也就是登录用户的id ") Integer uid) {
        return tUserinfoService.queryByUid(uid);
    }
}
