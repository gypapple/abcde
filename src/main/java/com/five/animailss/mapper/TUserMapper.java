package com.five.animailss.mapper;

import com.five.animailss.entity.TUser;
import com.five.animailss.vo.ResultBean;

public interface TUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TUser tUser);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    TUser selectByPhone(String phone);

    int updateTUser(TUser tUser);
}