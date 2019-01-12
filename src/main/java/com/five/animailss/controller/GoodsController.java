package com.five.animailss.controller;

import com.five.animailss.entity.Goods;
import com.five.animailss.entity.TAnimail;
import com.five.animailss.service.GoodsService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(produces = "这是商品接口文档",value = "商品接口文档")
@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @ApiOperation(notes = "实现传递参数，响应指定的数据",tags = {"根据商品类型查询某种商品信息"},value = "某种商品的信息")
    @GetMapping("/getGoodsByGTid")
    public ResultBean animailInfo(Integer gtid) {
        List<Goods> goods = goodsService.selectGoodsByGtid(gtid);
        return ResultUtil.setOK("成功",goods);
    }
}
