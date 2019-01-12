package com.five.animailss.service.impl;

import com.five.animailss.entity.TPost;
import com.five.animailss.mapper.TPostMapper;
import com.five.animailss.service.TPostService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.PageBeanVo;
import com.five.animailss.vo.ResultBean;


import com.five.animailss.vo.VPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TPostServiceImpl implements TPostService {

    @Autowired
    private TPostMapper tPostMapper;
    @Override
    public ResultBean modifyCount(TPost tPost) {
        tPostMapper.updateTCount(tPost);
        if(tPost != null) {
            return ResultUtil.setOK("成功",null);
        }else {
            return  ResultUtil.setError("失败",null);
        }

    }

    @Override
    public PageBeanVo<VPost> queryByPage(Integer page, Integer limit) {
        Map<String,Object> map = new HashMap<>();
        map.put("index",(page-1)*limit);
        map.put("limit",limit);
       /* List<TPost> list = tPostMapper.selectAll();
        PageInfo<TPost> pageInfo = new PageInfo<>(list);*/
        return PageBeanVo.setPage(tPostMapper.selectCount(), tPostMapper.selectAll(map));
    }

    @Override
    public ResultBean queryByPtype(Integer pType) {
        List<VPost> list = tPostMapper.selectByType(pType);
        if (pType != null) {
            return ResultUtil.setOK("成功",list);
        }else {
            return ResultUtil.setError("失败",null);
        }

    }

    @Override
    public ResultBean queryTime() {
        List<VPost> list = tPostMapper.selectByTime();
        if (list != null) {
            return ResultUtil.setOK("成功",list);
        }else {
            return ResultUtil.setError("失败",null);
        }
    }

    @Override
    public ResultBean queryCount() {
        List<VPost> list = tPostMapper.selectByCount();
        if (list != null) {
            return ResultUtil.setOK("成功",list);
        }else {
            return ResultUtil.setError("失败",null);
        }
    }

    @Override
    public ResultBean queryByUid(Integer pUid) {
        List<VPost> list = tPostMapper.selectByUid(pUid);
        if (list != null) {
            return ResultUtil.setOK("成功",list);
        }else {
            return ResultUtil.setError("失败",null);
        }
    }
    @Override
    public ResultBean selectAllTPost() {
        List<VPost> list = tPostMapper.selectAllTPost();
        if (list.equals(null)) {
            return ResultUtil.setError("查询失败",null);
        } else {
            return ResultUtil.setOK("查询成功", list);
        }
    }
}
