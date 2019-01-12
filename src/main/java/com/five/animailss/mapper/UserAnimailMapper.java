package com.five.animailss.mapper;

import com.five.animailss.entity.UserAnimail;
import org.apache.ibatis.annotations.Param;

public interface UserAnimailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAnimail record);

    int insertSelective(UserAnimail record);

    UserAnimail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAnimail record);

    int updateByPrimaryKey(UserAnimail record);
    //用户关注某个宠物
    int insertUserIdAndAnimailId(@Param("uid")Integer uid, @Param("aid")Integer aid);
}