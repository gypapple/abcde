package com.five.animailss.mapper;

import com.five.animailss.entity.TGoodstype;

public interface TGoodstypeMapper {
    int deleteByPrimaryKey(Integer gtId);

    int insert(TGoodstype record);

    int insertSelective(TGoodstype record);

    TGoodstype selectByPrimaryKey(Integer gtId);

    int updateByPrimaryKeySelective(TGoodstype record);

    int updateByPrimaryKey(TGoodstype record);
}