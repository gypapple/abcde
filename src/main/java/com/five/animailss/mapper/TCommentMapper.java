package com.five.animailss.mapper;

import com.five.animailss.entity.TComment;
import com.five.animailss.vo.VComment;

import java.util.List;

public interface TCommentMapper {

    int insertComment(TComment tComment);
    int updatecCount(TComment tComment);
    VComment selectById(Integer cid);
    List<VComment> selectByPid(Integer cPid);
    List<VComment> selectByCount(Integer cPid);
}
