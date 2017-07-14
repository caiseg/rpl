package com.platform.framework.entity.pages;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 
  * miniui 要求的格式 	
  * @author 王求卿[wangqiuqing] Tel:18101037995
  * @param <T>
  * @createDate 2017-7-10 上午9:46:53
 */
public class PageMiniBean<T> {


	private long total;// 总记录条数
	private List<T> data = Lists.newArrayList();// 记录数据


	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	

}
