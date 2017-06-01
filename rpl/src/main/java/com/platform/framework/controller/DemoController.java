package com.platform.framework.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.Lists;
import com.platform.common.config.SystemConfig;
import com.platform.common.utils.JsonUtils;
import com.platform.framework.entity.Test;
import com.platform.framework.entity.rights.FwRightRole;
import com.platform.framework.service.rights.FwRightRoleService;

@RestController
public class DemoController {

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
	 * 异常统一处理，进入index.html模板页面
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView welcome(Model model) {
		Test test = new Test();
		test.setAge(18);
		test.setName("zhangsan");
		test.setId("1");
		test.setBirthday(new Date());
		test.setBirthtime(new Timestamp(new Date().getTime()));
		model.addAttribute("person", test);
		ModelAndView mv = new ModelAndView("user/index");
		return mv;
	}
	
	/**
	 * 异常统一处理，进入index.html模板页面
	 * 
	 * @return
	 */
	@RequestMapping("/index1")
	public ModelAndView welcomejsp(Model model) {
		Test test = new Test();
		test.setAge(18);
		test.setName("zhangsan");
		test.setId("1");
		test.setBirthday(new Date());
		test.setBirthtime(new Timestamp(new Date().getTime()));
		model.addAttribute("person", test);
		ModelAndView mv = new ModelAndView("user/index1");
		return mv;
	}

}