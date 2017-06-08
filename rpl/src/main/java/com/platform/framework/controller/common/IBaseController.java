package com.platform.framework.controller.common;

import com.platform.common.security.UserInfo;


/**
 * 所有controller 集成的类，便于获取通用属性
 * @author Administrator
 *
 */
public interface IBaseController {

	/**
	 * 用户主键
	 * @return
	 */
	String getUserId();

	
	/**
	 * 用户登录编码
	 * @return
	 */
	String getUserCode();

	
	/**
	 * 用户实体
	 * @return
	 */
	UserInfo getUserEntity();
	
	
	/**
	 * 功能描述：获取当前用户拥有的角色权限的字符串；字符串以逗号分隔。
	 * @return
	 */
	String getUserRoleStr();
	
	/**
	 * 生成UUID方法
	 * @return
	 */
	String getUUID();
    
}
