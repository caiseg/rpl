package com.platform.framework.controller.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.platform.framework.dao.rights.FwRightUserRepository;
/**
 * 
 * @author wangqq
 *
 */
@Controller
public class GlobalController extends BaseController{
	

	@Autowired
	FwRightUserRepository fwRightUserRepository;

	
    @RequestMapping("/500")
	public String jsp500() {
		return "/exception/500";
	}
    @RequestMapping("/404")
	public String jsp404() {
		return "/exception/404";
	}
    @RequestMapping("/401")
	public String jsp401() {
		return "/exception/401";
	}
    
    @RequestMapping("/appli")
    public String jspapplicationhome(ModelMap model){
    	long total  = fwRightUserRepository.count();//获取所有用户数量
    	model.addAttribute("usertotal", total);
    	return "/home/application_home";
    }

}