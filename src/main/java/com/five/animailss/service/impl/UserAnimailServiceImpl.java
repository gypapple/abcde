package com.five.animailss.service.impl;

import com.five.animailss.mapper.UserAnimailMapper;
import com.five.animailss.service.UserAnimailService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAnimailServiceImpl implements UserAnimailService {
    @Autowired
    UserAnimailMapper userAnimailMapper;
    @Override
    public int insertUidAndAnimailId(@Param("uid") Integer uid, @Param("aid")Integer aid) {
        return userAnimailMapper.insertUserIdAndAnimailId(uid,aid);
    }
}
