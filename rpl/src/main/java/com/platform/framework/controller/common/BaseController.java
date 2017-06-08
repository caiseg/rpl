package com.platform.framework.controller.common;


import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.google.common.base.Joiner;
import com.platform.common.security.AuthorityInfo;
import com.platform.common.security.UserInfo;

/**
 * 通用controller继承
 * @author Administrator
 *
 */
@Controller
@Scope(value = "session")
public class BaseController implements IBaseController {

	@Override
	public String getUserId() {
		if(null != getUserEntity()){
			return getUserEntity().getId();
		}
		return null;
	}


	@Override
	public UserInfo getUserEntity() {
		UserInfo userInfo = null;
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(null != authentication){
			//如果当前未登录采用匿名用户
			if(authentication.getPrincipal().equals("anonymousUser")){
				return null;
			}else{
				userInfo = (UserInfo)authentication.getPrincipal();
			}
		}
		return userInfo;
	}


	@Override
	public String getUserCode() {
		if(null != getUserEntity()){
			return getUserEntity().getUsername();
		}
		return null;
	}

	@Override
	public String getUserRoleStr() {
		String roleStr = "";
		if(null != getUserEntity()){
			Set<AuthorityInfo> set =  getUserEntity().getAuthorities();
			for(AuthorityInfo authorityInfo :set){
				if(roleStr.equals("")){
					roleStr = authorityInfo.getAuthority();
				}else{
					roleStr = roleStr + ","+ authorityInfo.getAuthority();
				}
			}
		}
		return roleStr;
	}


	@Override
	public String getUUID() {
		return java.util.UUID.randomUUID().toString();
	}
	
	public static void main(String[] args) {
		Joiner joiner = Joiner.on(",").skipNulls();
		System.out.println(joiner.toString());
		System.out.println(joiner.join("Harry","11"));

	}
}
