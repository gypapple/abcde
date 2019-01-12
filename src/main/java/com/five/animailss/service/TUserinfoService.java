package com.five.animailss.service;

import com.five.animailss.entity.TUserinfo;
import com.five.animailss.vo.ResultBean;

public interface TUserinfoService {

    ResultBean saveInfo(TUserinfo info);
    ResultBean modifyInfo(TUserinfo info);
    ResultBean queryByUid(Integer uid);
}
