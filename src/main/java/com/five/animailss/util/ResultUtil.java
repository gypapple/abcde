package com.five.animailss.util;

import com.five.animailss.vo.ResultBean;

public class ResultUtil {
    //操作成功
    public static ResultBean setOK(String msg, Object data){
        ResultBean resultBean=new ResultBean();
        resultBean.setCode(0);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }
    //操作失败
    public static ResultBean setError(String msg,Object data){
        ResultBean resultBean=new ResultBean();
        resultBean.setCode(1);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }
    //操作结果
    public static ResultBean setResult(Integer code,String msg,Object data){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(code);
        resultBean.setMsg(msg);
        resultBean.setData(data);
        return resultBean;
    }
}
