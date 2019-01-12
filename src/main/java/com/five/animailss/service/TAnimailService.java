package com.five.animailss.service;

import com.five.animailss.entity.Goods;
import com.five.animailss.entity.TAnimail;
import com.five.animailss.vo.ResultBean;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface TAnimailService {
    //查询所有的宠物
    PageInfo<TAnimail> selectAllAnimailList(String pageNum, String pageSize);

    PageInfo<TAnimail> selectAllAnimailList(String pageNum, String pageSize, Integer i);
    //根据id查询宠物信息
    TAnimail selectById(Integer id);
    //根据status查询宠物类型
    List<TAnimail> selectByStatus(String status);
    //根据价格区间查询宠物
    List<TAnimail> selectByPrice(String minPrice,String maxPrice);
}
