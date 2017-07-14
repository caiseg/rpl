package com.platform.framework.entity.pages;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 
  * bootstratp 要求的格式 	
  * @author 王求卿[wangqiuqing] Tel:18101037995
  * @param <T>
  * @createDate 2017-7-10 上午9:46:32
 */
public class PageBootBean<T> {

	/*
	 * "{ "current": 1, "rowCount": 10, "rows": [ { "id": 19, "sender":
	 * "123@test.de", "received": "2014-05-30T22:15:00" }, { "id": 14, "sender":
	 * "123@test.de", "received": "2014-05-30T20:15:00" }, ], "total": 1123 }";
	 */
	private int current;// 当前页
	private int rowCount;// 当前行总条数

	private long total;// 总记录条数
	private List<T> rows = Lists.newArrayList();// 记录数据

	public int getCurrent() {
		return current+1;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

}
