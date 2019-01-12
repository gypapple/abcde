package com.five.animailss.service.impl;

import com.five.animailss.entity.TComment;
import com.five.animailss.mapper.TCommentMapper;
import com.five.animailss.service.TCommentService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.ResultBean;
import com.five.animailss.vo.VComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCommentServiceImpl implements TCommentService {

    @Autowired
    private TCommentMapper tCommentMapper;
    @Override
    public ResultBean saveComment(TComment tComment) {
        if (tCommentMapper.insertComment(tComment)> 0) {
            return ResultUtil.setOK("成功",null);
        } else {
            return ResultUtil.setError("失败",null);
        }
    }

    @Override
    public ResultBean modifycCount(TComment tComment) {
        if (tCommentMapper.updatecCount(tComment) >0) {
            return ResultUtil.setOK("成功",null);
        } else {
            return ResultUtil.setError("失败",null);
        }
    }

    @Override
    public ResultBean queryByCid(Integer cid) {
        VComment comment = tCommentMapper.selectById(cid);
        return ResultUtil.setOK("成功",comment);
    }

    @Override
    public ResultBean queryByPid(Integer cPid) {
        List<VComment> list = tCommentMapper.selectByPid(cPid);
        if (list == null) {
            return ResultUtil.setError("失败",null);
        } else {
            return ResultUtil.setOK("成功",list);
        }

    }

    @Override
    public ResultBean queryCount(Integer cPid) {
        List<VComment> list = tCommentMapper.selectByCount(cPid);
        if (list == null) {
            return ResultUtil.setError("失败",null);
        } else {
            return ResultUtil.setOK("成功",list);
        }
    }
}
