package com.five.animailss.mapper;

import com.five.animailss.entity.TAnimail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TAnimailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAnimail record);

    int insertSelective(TAnimail record);

    TAnimail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAnimail record);

    int updateByPrimaryKey(TAnimail record);

    List<TAnimail> selectAllAnimail();

    List<TAnimail> selectAnimailByStatus(String status);

    List<TAnimail> selectAnimailByPrice(@Param("minPrice") String minPrice,@Param("maxPrice") String maxPrice);
}