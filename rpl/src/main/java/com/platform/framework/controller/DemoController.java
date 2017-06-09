package com.platform.framework.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.platform.common.config.SystemConfig;
import com.platform.common.security.UserInfo;
import com.platform.common.utils.JsonUtils;
import com.platform.framework.controller.common.BaseController;
import com.platform.framework.entity.Test;
import com.platform.framework.entity.rights.FwRightRole;
import com.platform.framework.service.rights.FwRightRoleService;

@RestController
public class DemoController extends BaseController{

	@Autowired
	SystemConfig systemConfig;
	
	@Autowired
	FwRightRoleService fwRightRoleService;
	
	

	@RequestMapping("/cs")
	public  String home() {
		return "Hello " + systemConfig.getDbType();
	}
	
	@RequestMapping("/nativeQuery")
	public  String nativeQuery() throws Exception {
		List list =fwRightRoleService.findNativeSql();
		return JsonUtils.dealJson(list);
	}
	
	
	@RequestMapping("/roleQuery")
	public  FwRightRole roleQuery(@RequestParam String rolename) throws Exception {
		FwRightRole fwRightRole = fwRightRoleService.findFwRightOrgByName(rolename);
		return fwRightRole;
	}
	
	@RequestMapping("/roleDeal")
	public  String roleDeal() throws Exception {
		fwRightRoleService.saveRole();
		return "事务测试";
	}
	
	/**
	 * 异常统一处理，内部错误，抛出json格式
	 * 
	 * @return
	 */
	@RequestMapping("/er")
	public String error() {
		List<String> list = Lists.newArrayList();
		System.out.println(list.get(1));
		return "";
	}

	/**
	 * 异常统一处理，外部界面错误，未找到sys对应的模板或有sys.html模板但模板内部报错。抛出500异常
	 * 
	 * @return
	 */
	@RequestMapping("/er1")
	public ModelAndView error1() {
		ModelAndView mv = new ModelAndView("sys");
		//List<String> list = Lists.newArrayList();
		//System.out.println(list.get(1));
		return mv;
	}

	/**
	 * 进入index.html模板页面
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView welcome(Model model) {
		model.addAttribute("user", super.getUserEntity());
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	
	/**
	 * 异常统一处理，找不到页面进入抛出404
	 * 
	 * @return
	 */
	@RequestMapping("/index1")
	public ModelAndView welcomejsp(Model model) {
		ModelAndView mv = new ModelAndView("user/index1");
		return mv;
	}
	
	/**
	 * 进入index2.html模板页面
	 * 
	 * @return
	 **/
	@RequestMapping("/index2")
	public ModelAndView welcome2(Model model) {
		
		ModelAndView mv = new ModelAndView("index2");
		return mv;
	}
	
	 @RequestMapping("/")  
    public ModelAndView index(Model model) {  
		 ModelAndView mv = new ModelAndView("index");
		 
		// System.out.println("*******"+super.getUserRoleStr());
		// System.out.println(super.getUserCode());
		// System.out.println("*******"+super.getUserId());
		 
		 model.addAttribute("user", super.getUserEntity());
		 return mv;
    }  
  
    @RequestMapping("/hello")  
    public String hello() {  
        return "不验证哦";  
    }
    
    @RequestMapping("/pages")  
    public String pages() {  
        return "也不验证哦";  
    }  
    
	  
    @PreAuthorize("hasAuthority('guest')")//有guest权限的才能访问  
    @RequestMapping("/security")  
    public String security() {  
        return "hello world security";  
    }  
  
    @PreAuthorize("hasAuthority('admin')")//必须要有admin权限的才能访问  
    @RequestMapping("/authorize")  
    public String authorize() {  
        return "有权限访问";  
    }  
	

}