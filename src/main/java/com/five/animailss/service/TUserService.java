package com.five.animailss.service;

import com.five.animailss.entity.TUser;
import com.five.animailss.vo.ResultBean;

public interface TUserService {

    ResultBean login(String phone, String password);
    ResultBean saveTUser(TUser tUser);
    ResultBean modifyTuser(TUser tUser);
}
