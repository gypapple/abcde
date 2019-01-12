package com.five.animailss.controller;

import com.five.animailss.service.UserAnimailService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.ResultBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAnimailController {
    @Autowired
    UserAnimailService userAnimailService;
    @ApiOperation(notes = "实现传递参数，响应指定的数据",tags = {"根据用户id和宠物id关注宠物"},value = "用户id，宠物id")
    @GetMapping("/insertUidAnimailing")
    public ResultBean focusAnimail(Integer uid, Integer aid) {
        int i = userAnimailService.insertUidAndAnimailId(uid, aid);
        return ResultUtil.setOK("成功",i);
    }
}
