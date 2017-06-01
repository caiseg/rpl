package com.platform.common.utils;


import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.data.domain.Page;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.platform.framework.entity.pages.PageBean;

public class JsonUtils {

	/**
	 * 处理Jpa返回的Page对象
	 * "当前第几页："+pages.getNumber()+"-当前记录行数-"+pages.getSize()+"-总共多少页--"+pages.getTotalPages()+"-总记录条数--"+pages.getTotalElements()
	 * @return
	 */
	public static <T> String dealPage(Page<T> pages) {
		PageBean<T> pagebean = new PageBean<T>();
		pagebean.setCurrent(pages.getNumber());
		pagebean.setRowCount(pages.getSize());
		pagebean.setTotal(pages.getTotalElements());
		pagebean.getRows().addAll(pages.getContent());
		return JSONObject.toJSONString(pagebean);
	}

	
	/**
	 * 处理返回的List对象JSOn
	 * @return
	 */
	public static String dealJson(List list) {
		return JSONArray.toJSONString(list);
	}

}
