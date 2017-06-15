package com.platform.common.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.platform.common.security.UserInfo;
/**
 * 自定义拦截器
 * @author Administrator
 *
 */
public class MyInterceptor  implements HandlerInterceptor{
	
	/**
	 * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
	 */
	@Override
	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse rep, Object obj, Exception exc)
			throws Exception {
		
	}

	/**
	 * 视图被渲染之前-- Controller方法调用之后
	 */
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse rep,
			Object obj, ModelAndView mv) throws Exception {
		
		UserInfo userInfo = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		  if (principal instanceof UserInfo) {
			 userInfo = (UserInfo)principal;
	      }
		 // System.out.println(obj.toString());
		  mv.getModelMap().addAttribute("user", userInfo);
		  String sysId = req.getParameter("sysId");
		  mv.getModelMap().addAttribute("sysId", sysId);
		 // model.addAttribute("user", userInfo);
		
	}
	
	/**
	 * Controller方法调用之前
	 */
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse rep,
			Object obj) throws Exception {
		return true;
	}

}
