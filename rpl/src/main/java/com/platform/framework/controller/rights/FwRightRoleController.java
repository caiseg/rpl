package com.platform.framework.controller.rights;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.platform.common.utils.JsonUtils;
import com.platform.framework.entity.rights.FwRightRole;
import com.platform.framework.service.rights.FwRightRoleService;

@RestController
@RequestMapping("/role")
public class FwRightRoleController {

	@Autowired
	FwRightRoleService fwRightRoleService;

	/**
	 * 
	 * roleIndex主页地址
	 * 
	 * @return
	 */
	@RequestMapping("/roleIndex")
	public ModelAndView welcome(Model model) {
		ModelAndView mv = new ModelAndView("user/roleIndex");
		return mv;
	}
	
	@PreAuthorize("hasAuthority('role')")//必须要有admin权限的才能访问  
    @RequestMapping("/index")  
    public ModelAndView authorize() {  
    	ModelAndView mv = new ModelAndView("role/index");
        return mv;  
    }  

	/**
	 * 
	 * role分页数据
	 * @return
	 */
	@RequestMapping(value = "roleList", method = { RequestMethod.POST })
	public String roleList(@RequestParam String rolename) {
		Sort sort = new Sort(Sort.Direction.DESC, "id");
		Pageable pageable = new PageRequest(0, 10, sort); //查询十条数据 
		Page<FwRightRole> pages= fwRightRoleService.findRolePage(rolename,pageable);
		return JsonUtils.dealBootPage(pages);
	}
	
	
	/**
	 * 
	 * 本地role分页数据
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "dicList", method = { RequestMethod.GET })
	public String dicList() throws Exception {
		Sort sort = new Sort(Sort.Direction.DESC, "datathird_dic_id");
		Pageable pageable = new PageRequest(1, 10, sort); //查询十条数据 
		Page<Map> pages= fwRightRoleService.findNativeSql(pageable);
		return JsonUtils.dealBootPage(pages);
	}


}