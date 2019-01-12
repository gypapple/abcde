package com.five.animailss.service.impl;

import com.five.animailss.entity.TAnimail;
import com.five.animailss.mapper.TAnimailMapper;
import com.five.animailss.mapper.TFansfocusMapper;
import com.five.animailss.service.TAnimailService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TAnimailServiceImpl implements TAnimailService {
    @Autowired
    private TAnimailMapper tAnimailMapper;
    @Autowired
    private TFansfocusMapper tFansfocusMapper;

    @Override
    public PageInfo<TAnimail> selectAllAnimailList(String pageNum, String pageSize) {
        return null;
    }

    @Override
    public PageInfo<TAnimail> selectAllAnimailList(String pageNum, String pageSize,Integer i) {

        List<TAnimail> TAnimails = tAnimailMapper.selectAllAnimail();

        PageInfo<TAnimail> pageInfo = new PageInfo<TAnimail>(TAnimails);

        System.out.println("________________________");
        System.out.println(pageInfo.getPageSize());
        System.out.println("_______________________");
        return pageInfo;
    }

    @Override
    public TAnimail selectById(Integer id) {
        return tAnimailMapper.selectByPrimaryKey(id);
    }


    @Override
    public List<TAnimail> selectByStatus(String status) {
        return  tAnimailMapper.selectAnimailByStatus(status);
    }

    @Override
    public List<TAnimail> selectByPrice(String minPrice, String maxPrice) {

        Map<String,Object> map = new HashMap<>();
        map.put("minPrice",minPrice);
        map.put("maxPrice", maxPrice);
        return tAnimailMapper.selectAnimailByPrice(map);
    }
}
