package com.five.animailss.controller;

import com.five.animailss.entity.TAnimail;
import com.five.animailss.mapper.TAnimailMapper;
import com.five.animailss.service.TAnimailService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.ResultBean;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Api(produces = "这是宠物接口文档",value = "宠物接口文档")
@RestController
@RequestMapping("/animail")
public class TAnimailController {
    @Autowired
    private TAnimailService tAnimailService;
    @ApiOperation(notes = "响应数据",tags = {"分页查询所有的宠物信息"},value = "宠物信息")
    @GetMapping("/getanimailing")
    public ResultBean orderingList(String pageNum, String pageSize,Integer i, String token, HttpServletResponse resp) {
        PageInfo<TAnimail> pageInfo = tAnimailService.selectAllAnimailList(pageNum,pageSize,i);
        resp.addHeader("Access-Control-Allow-Origin", "*");
        return ResultUtil.setOK("成功",pageInfo);
    }
    @ApiOperation(notes = "实现传递参数，响应指定的数据",tags = {"根据id查询宠物信息"},value = "某个宠物的id信息")
    @GetMapping("/getanimailingById")
    public ResultBean animailInfo(Integer id,HttpServletResponse resp) {
        resp.addHeader("Access-Control-Allow-Origin", "*");
        TAnimail tAnimail = tAnimailService.selectById(id);
        return ResultUtil.setOK("成功",tAnimail);
    }

    @ApiOperation(notes = "实现传递参数，响应指定的数据",tags = {"根据宠物类型查询同一类型的宠物"},value = "宠物类型status")
    @GetMapping("/getanimailByStatusing")
    public ResultBean animailingList(String status) {
        List<TAnimail> tAnimails = tAnimailService.selectByStatus(status);
        return ResultUtil.setOK("成功",tAnimails);
    }
    @ApiOperation(notes = "实现传递参数，响应指定的数据",tags = {"根据价格区间查询不同的宠物"},value = "最小价格minPrice,最大价格maxPrice")
    @GetMapping("/getanimailByPriceing")
    public ResultBean animailListByPriceing(String minPrice,String maxPrice) {
        List<TAnimail> tAnimails = tAnimailService.selectByPrice(minPrice, maxPrice);
        return ResultUtil.setOK("成功",tAnimails);
    }
}
