package com.five.animailss.mapper;

import com.five.animailss.entity.TFansfocus;
import org.apache.ibatis.annotations.Param;

public interface TFansfocusMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(TFansfocus record);

    int insertSelective(TFansfocus record);

    TFansfocus selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(TFansfocus record);

    int updateByPrimaryKey(TFansfocus record);
    //用户关注某个宠物
    int insertUserIdAndAnimailId(@Param("uid")Integer uid,@Param("aid")Integer aid);
}