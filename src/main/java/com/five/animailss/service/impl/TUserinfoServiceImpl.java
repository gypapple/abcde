package com.five.animailss.service.impl;

import com.five.animailss.entity.TUserinfo;
import com.five.animailss.mapper.TUserinfoMapper;
import com.five.animailss.service.TUserinfoService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TUserinfoServiceImpl implements TUserinfoService {

    @Autowired
    private TUserinfoMapper tUserinfoMapper;
    @Override
    public ResultBean saveInfo(TUserinfo info) {
        tUserinfoMapper.insert(info);
        return ResultUtil.setOK("成功",null);
    }

    @Override
    public ResultBean modifyInfo(TUserinfo info) {

        tUserinfoMapper.updateInfo(info);
        return ResultUtil.setOK("成功",null);
    }

    @Override
    public ResultBean queryByUid(Integer uid) {
        if (uid == null) {
            return ResultUtil.setError("失败",null);
        }
        TUserinfo info = tUserinfoMapper.selectByUid(uid);
        return ResultUtil.setOK("成功",info);
    }
}
