package com.platform.common.utils;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

/**
 * 
 * @author 处理bootstrap格式请求的参数 以及 miniui的格式请求的参数
 *
 */
public class PageUtils {
	/**
	 * 
	  * 接受 current=1&rowCount=10&sort[sender]=asc&searchPhrase=&id=b0df282a-0d67-40e5-8558-c9e93b7befed	
	  * Sort sort = new Sort(Sort.Direction.DESC, "id");
	  * Pageable pageable = new PageRequest(0, 10, sort);
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param request
	  * @return bootstrap的格式
	  * @throws Exception
	  * @createDate 2017-7-7 下午2:32:30
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public static Pageable dealbootRequest(HttpServletRequest request) throws Exception{
		int current = Integer.parseInt(request.getParameter("current"));//获取当前页
		int rowCount = Integer.parseInt(request.getParameter("rowCount"));//当前页记录条数
		Enumeration<String> sorts = request.getParameterNames();
		String sort = "";
		while(sorts.hasMoreElements()){
			String sortName = sorts.nextElement();//获取枚举值
			if(sortName.contains("sort[")){
				sort = sortName;
				break;
			}
		}
		String dir = request.getParameter(sort);
		
		Direction direction = Sort.Direction.DESC;
		
		if(dir.equals("asc")){
			direction = Sort.Direction.ASC;
		}
		
        Sort s  = new Sort(direction,sort.substring(sort.indexOf("[")+1, sort.lastIndexOf("]")));
        
      //  System.out.println(current+"-------"+rowCount);
		Pageable pageable = new PageRequest(current-1, rowCount, s); //查询十条数据 
		
		return pageable;
		
	}

	/**
	 * 
	  *  处理前台接收的miniUI传入的参数，封装成page需要的结构数据 ,sortField,sortOrder,pageSize,pageIndex
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param request
	  * @return miniui的格式
	  * @createDate 2017-7-10 上午8:45:49
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public static Pageable dealminiRequest(HttpServletRequest request) {
		int current = Integer.parseInt(request.getParameter("pageIndex"));//获取当前页
		int rowCount = Integer.parseInt(request.getParameter("pageSize"));//当前页记录条数
		
		String dir = request.getParameter("sortOrder");
		Direction direction = Sort.Direction.DESC;
		if(dir.equals("asc")){
			direction = Sort.Direction.ASC;
		}
		
		String sortField = request.getParameter("sortField");
		
        Sort s  = new Sort(direction,sortField);
        
        System.out.println("current:"+current+"rowCount:"+rowCount);
        
		Pageable pageable = new PageRequest(current, rowCount, s); //查询十条数据 
		
		return pageable;
	}
}
