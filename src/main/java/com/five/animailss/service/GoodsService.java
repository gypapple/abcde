package com.five.animailss.service;

import com.five.animailss.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> selectGoodsByGtid(Integer gtid);
}
