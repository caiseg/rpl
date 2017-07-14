package com.platform.framework.controller.rights;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.platform.common.utils.JsonUtils;
import com.platform.common.utils.PageUtils;
import com.platform.framework.entity.rights.FwRightUser;
import com.platform.framework.service.rights.FwRightUserService;

@RestController
@RequestMapping("/user")
public class FwRightUserController {


	
	@Autowired
	FwRightUserService fwRightUserService;


	/**
	 * 
	 * user分页数据
	 * @return
	 */
	@RequestMapping(value = "userList", method = { RequestMethod.POST })
	public String roleList(HttpServletRequest request) {
		
		String searchCtx = request.getParameter("searchPhrase");//查询条件框
		
		//current=1&rowCount=10&sort[sender]=asc&searchPhrase=&id=b0df282a-0d67-40e5-8558-c9e93b7befed
		//current=1&rowCount=10&sort[sender]=asc&searchPhrase=
		
		//System.out.println(usercode+"----------");
		//Sort sort = new Sort(Sort.Direction.DESC, "id");
		//Pageable pageable = new PageRequest(0, 10, sort); //查询十条数据
		Pageable pageable = null;
		try{
			pageable = PageUtils.dealbootRequest(request);
		}catch (Exception e) {
			e.printStackTrace();
		}
		Page<FwRightUser> pages= fwRightUserService.findUserPage(searchCtx,pageable);
		return JsonUtils.dealBootPage(pages);
	}
	
	
	  
    @PreAuthorize("hasAuthority('user')")//有用户添加权限的才能访问  
    @RequestMapping("/index")  
    public ModelAndView userIndex() {
    	ModelAndView mv = new ModelAndView("rights/user/index");
		return mv;
    }  
	


}