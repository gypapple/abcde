package com.five.animailss.service;

import com.five.animailss.entity.TComment;
import com.five.animailss.vo.ResultBean;

public interface TCommentService {

    ResultBean saveComment(TComment tComment);
    ResultBean modifycCount(TComment tComment);
    ResultBean queryByCid(Integer cid);
    ResultBean queryByPid(Integer cPid);
    ResultBean queryCount(Integer cPid);
}
