package com.five.animailss.controller;

import com.five.animailss.entity.TPost;
import com.five.animailss.service.TPostService;
import com.five.animailss.vo.PageBeanVo;
import com.five.animailss.vo.ResultBean;
import com.five.animailss.vo.VPost;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;



@Api(value = "社区贴子Controller", tags = "社区帖子接口")
@RequestMapping("/tpost")
public class TPostController {

    @Autowired
    private TPostService tPostService;
    @PutMapping("/modifyCount")
    @ApiOperation("点赞+1")
    public ResultBean modifyCount(@ApiParam(value = "获取p_id,点击喜欢，点赞数+1") TPost tPost) {
        return tPostService.modifyCount(tPost);
    }
    @ApiOperation("分页查询")
    @GetMapping("/listTPostBypage")
    public PageBeanVo<VPost> queryByPage(@ApiParam(value = "page表示查询的第几页，limit表示每页多少条数据") Integer page, Integer limit) {
        return tPostService.queryByPage(page,limit);
    }
    @ApiOperation("pType表示社区的首页，1表示求助问答，2表示狗狗，3表示猫猫，4表示爪友生活，5表示其他宠物，")
    @GetMapping("/listByPtype")
    public ResultBean queryByPtype(@ApiParam(value = "根据传入pType查询出不同分类的帖子") Integer pType) {
        return tPostService.queryByPtype(pType);
    }

    @GetMapping("/tPostTime")
    @ApiOperation("根据帖子发表时间排序，是最新这个模块")
    public ResultBean queryTime() {
        return tPostService.queryTime();
    }
    @GetMapping("/tPostCount")
    @ApiOperation("根据点赞的数量排序帖子，是热门这个模块")
    public ResultBean queryCount() {
        return tPostService.queryCount();
    }
    @GetMapping("/tPostByUid")
    @ApiOperation("查询自己发表的帖子")
    public ResultBean queryByUid(@ApiParam(value = "pUid就是用户登陆所带的id") Integer pUid) {
        return tPostService.queryByUid(pUid);
    }

    @ApiOperation(notes = "响应数据",tags = {"查询所有的帖子信息"},value = "帖子信息")
    @GetMapping("/gettposting")
    public ResultBean tpostingList(){
        return tPostService.selectAllTPost();
    }

}
