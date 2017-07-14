package com.platform.framework.controller.rights;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.platform.common.utils.JsonUtils;
import com.platform.common.utils.PageUtils;
import com.platform.framework.controller.common.BaseController;
import com.platform.framework.entity.rights.FwRightOrg;
import com.platform.framework.service.rights.FwRightOrgService;

/**
 * 
  * 组织结构类 	
  * @author 王求卿[wangqiuqing] Tel:18101037995
  * @createDate 2017-7-7 下午5:16:55
 */
@RestController
@RequestMapping("/org")
public class FwRightOrgController extends BaseController{


	
	@Autowired
	FwRightOrgService fwRightOrgService;


	/**
	 * 
	  * org object数据	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param request
	  * @return 组织机构object数据	
	  * @createDate 2017-7-7 下午1:58:29
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping(value = "list", method = { RequestMethod.POST })
	public String orgList(HttpServletRequest request) {
		return JSONArray.toJSONString(fwRightOrgService.getAllOrgInfo());
	}
	/**
	 * 
	  * org map 数据 	提高效率
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param request
	  * @return 组织机构 树Map数据
	  * @throws Exception
	  * @createDate 2017-7-7 下午1:58:39
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping(value = "maplist", method = { RequestMethod.GET })
	public String orgMap(HttpServletRequest request) throws Exception {
		return JSONArray.toJSONString(fwRightOrgService.getAllOrgMap());
	}
	
	
	
	/**
	 * 
	  * 查询所有的数据	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param request
	  * @return org分页语句
	  * @throws Exception
	  * @createDate 2017-7-10 上午9:28:17
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@RequestMapping(value = "pagelist", method = { RequestMethod.POST })
	public String orgPageList(HttpServletRequest request) throws Exception {
		String searchCtx = request.getParameter("searchPhrase");//查询条件框
		String parentId = request.getParameter("parentId");
		Pageable pageable = null;
		try{
			pageable = PageUtils.dealminiRequest(request);
		}catch (Exception e) {
			e.printStackTrace();
		}
		Page<FwRightOrg> pages= null;
		if(StringUtils.isEmpty(parentId)){
			 pages= fwRightOrgService.findOrgPage(searchCtx,pageable);
		}else{
			 pages= fwRightOrgService.findParentPage(parentId,pageable);
		}
		return JsonUtils.dealMiniPage(pages);
	}
	
	/**
	 * 
	  * 添加用户 	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @return
	  * @createDate 2017-7-13 上午9:36:57
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	//@PreAuthorize("hasAuthority('org:add')")
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public String orgSave(HttpServletRequest request){
		String data = request.getParameter("data");
		FwRightOrg fwRightOrg =  JSONObject.parseObject(data, FwRightOrg.class);
		fwRightOrg.setId(this.getUUID());
		fwRightOrg.setCreateTime(new Date());
		fwRightOrg.setCreateUserCode(this.getUserId());//操作用户
		fwRightOrg.setCreateUserName(this.getUserCode());//操作编码
		fwRightOrg.setIsDeleted("0");//未删除
		fwRightOrg.setIsEnable("1");//可用
		return fwRightOrgService.saveOrg(fwRightOrg);
	}
	
	/**
	 * 
	  * 更新用户 	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @return
	  * @createDate 2017-7-13 上午9:36:57
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	//@PreAuthorize("hasAuthority('org:update')")
	@RequestMapping(value = "update", method = { RequestMethod.POST })
	public String orgUpdate(HttpServletRequest request){
		String data = request.getParameter("data");
		FwRightOrg fwRightOrg =  JSONObject.parseObject(data, FwRightOrg.class);
		fwRightOrg.setUpdateTime(new Date());
		fwRightOrg.setUpdateUserCode(this.getUserId());
		fwRightOrg.setUpdateUserName(this.getUserCode());
		return fwRightOrgService.updateOrg(fwRightOrg);
	}
	
	/**
	 * 
	  * 删除用户	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @return
	  * @createDate 2017-7-13 上午9:36:57
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@PreAuthorize("hasAuthority('org:delete')")
	@RequestMapping(value = "delete", method = { RequestMethod.DELETE })
	public String orgDelete(HttpServletRequest request){
		String ids = request.getParameter("ids");
		return fwRightOrgService.deleteOrg(ids);
	}
	
	
	/**
	 * 
	  * 组织机构维护主页	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @return
	  * @createDate 2017-7-13 上午9:37:19
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@PreAuthorize("hasAuthority('org')")//有用户添加权限的才能访问    
    @RequestMapping("/index")  
    public ModelAndView orgIndex() {
    	ModelAndView mv = new ModelAndView("rights/org/index");
		return mv;
    }
	
	/**
	 * 
	  * 组织机构添加，修改页面界面 	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @return
	  * @createDate 2017-7-13 上午9:37:43
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
    @RequestMapping("/edit")  
    public ModelAndView orgAdd(){
    	ModelAndView mv = new ModelAndView("rights/org/edit");
		return mv;
    }
    
    

	


}