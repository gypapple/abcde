package com.five.animailss.mapper;

import com.five.animailss.entity.TUserinfo;

public interface TUserinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserinfo info);

    int insertSelective(TUserinfo record);

    TUserinfo selectByUid(Integer uid);

    int updateByPrimaryKeySelective(TUserinfo record);

    int updateInfo(TUserinfo info);

}