package com.platform.framework.controller.common;


import java.util.Set;
import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

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


	/** 
     * 获得一个32位的UUID 
     * @return String UUID 
     */ 
    public  String getUUID(){ 
        String s = UUID.randomUUID().toString(); 
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24); 
    } 
	
	public static void main(String[] args) {
		//Joiner joiner = Joiner.on(",").skipNulls();
		//System.out.println(joiner.toString());
		//System.out.println(joiner.join("Harry","11"));
		  String s = UUID.randomUUID().toString(); 
		  System.out.println(s.length());
	        //去掉“-”符号 
	     
		  String uuid =  s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
		  System.out.println(uuid.length());

	}
}
