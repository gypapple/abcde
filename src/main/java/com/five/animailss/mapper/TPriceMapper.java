package com.five.animailss.mapper;

import com.five.animailss.entity.TPrice;

public interface TPriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPrice record);

    int insertSelective(TPrice record);

    TPrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPrice record);

    int updateByPrimaryKey(TPrice record);
}