package com.five.animailss.mapper;

import com.five.animailss.entity.TPost;
import com.five.animailss.vo.VPost;


import java.util.List;
import java.util.Map;

import java.util.List;

public interface TPostMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(TPost record);

    int insertSelective(TPost record);

    TPost selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(TPost record);

    int updateByPrimaryKey(TPost record);

    int updateTCount(TPost tPost);

    List<VPost> selectAll(Map<String,Object> param);

    int selectCount();
    /*List<Vpost> select();*/

    List<VPost> selectByTime();

    List<VPost> selectByCount();

    List<VPost> selectByType(Integer pType);

    List<VPost> selectByUid(Integer Uid);

    List<VPost> selectAllTPost();


}