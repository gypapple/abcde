package com.five.animailss.service.impl;

import com.five.animailss.entity.Goods;
import com.five.animailss.mapper.GoodsMapper;
import com.five.animailss.service.GoodsService;
import com.five.animailss.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectGoodsByGtid(Integer gtid) {
        return goodsMapper.selectGoodsByGGTid(gtid);
    }
}
