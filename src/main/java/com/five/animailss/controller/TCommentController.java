package com.five.animailss.controller;

import com.five.animailss.entity.TComment;
import com.five.animailss.service.TCommentService;
import com.five.animailss.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
@Api(produces = "这是社区帖子评论接口文档",value = "社区帖子评论接口文档")
public class TCommentController {

    @Autowired
    private TCommentService tCommentService;
    @PostMapping("/addComment")
    @ApiOperation(tags = "评论",value = "发表评论信息")
    public ResultBean saveComment(@ApiParam(value = "在帖子下面发表评论，获取登录用户的id和评论帖子的id") TComment tComment) {
        return tCommentService.saveComment(tComment);
    }
    @PutMapping("/modifycCount")
    @ApiOperation("给评论点赞，点击评论+1")
    public ResultBean modifycCount(@ApiParam(value = "获取当前评论的id，根据id修改评论的点赞数量") TComment tComment) {
        return  tCommentService.modifycCount(tComment);
    }
    @GetMapping("/listByCid")
    @ApiOperation("查看一条评论，没有多大的用处，可以忽略")
    public ResultBean queryByCid(@ApiParam(value = "查看当前评论的具体信息") Integer cId) {
        return  tCommentService.queryByCid(cId);
    }
    @GetMapping("/listByPid")
    @ApiOperation("查看某条帖子的所有评论")
    public ResultBean queryByPid(@ApiParam(value = "根据帖子的id，查询此条帖子的所有评论") Integer cPid) {
        return  tCommentService.queryByPid(cPid);
    }
    @GetMapping("/listCount")
    @ApiOperation("查看某条帖子的所有评论")
    public ResultBean queryCount(@ApiParam(value = "根据帖子的id，查询此条帖子的所有评论,并按照点赞数量从大到小排列")Integer cPid) {
        return  tCommentService.queryCount(cPid);
    }
}
