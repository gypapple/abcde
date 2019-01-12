package com.five.animailss.vo;

import java.util.List;

public class PageBeanVo<T> {
	private Integer code;
	
	private Integer count;
	
	private String msg;
	
	private List<T> data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
	public static <T> PageBeanVo setPage(Integer count, List<T> data) {
		
		PageBeanVo pvo = new PageBeanVo();
		pvo.setCode(0);
		pvo.setMsg("");
		pvo.setCount(count );
		pvo.setData(data);
		return pvo;
		
	}
}
