package com.platform.common.utils;


import java.util.List;

import org.springframework.data.domain.Page;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.platform.framework.entity.pages.PageBootBean;
import com.platform.framework.entity.pages.PageMiniBean;

public class JsonUtils {

	/**
	 * 
	  * 处理Jpa返回的BootstrapPage对象
	  * "当前第几页："+pages.getNumber()+"-当前记录行数-"+pages.getSize()+"-总共多少页--"+pages.getTotalPages()+"-总记录条数--"+pages.getTotalElements()
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param pages
	  * @return BootstrapPage对象
	  * @createDate 2017-7-7 下午2:30:54
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public static <T> String dealBootPage(Page<T> pages) {
		PageBootBean<T> pagebean = new PageBootBean<T>();
		pagebean.setCurrent(pages.getNumber());
		pagebean.setRowCount(pages.getSize());
		pagebean.setTotal(pages.getTotalElements());
		pagebean.getRows().addAll(pages.getContent());
		return JSONObject.toJSONString(pagebean);
	}
	
	/**
	 * 
	  * 处理Jpa返回的BootstrapPage对象
	  * "当前第几页："+pages.getNumber()+"-当前记录行数-"+pages.getSize()+"-总共多少页--"+pages.getTotalPages()+"-总记录条数--"+pages.getTotalElements()
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param pages
	  * @return BootstrapPage对象
	  * @createDate 2017-7-7 下午2:30:54
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public static <T> String dealMiniPage(Page<T> pages) {
		PageMiniBean<T> pagebean = new PageMiniBean<T>();
		pagebean.setTotal(pages.getTotalElements());
		pagebean.getData().addAll(pages.getContent());
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
