package com.platform.common.security;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.alibaba.druid.util.StringUtils;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.platform.framework.entity.rights.FwPlModule;
  
/** 
 * 用户信息 
 * @、这里我写了几个较为常用的字段，id，name，username，password，可以根据实际的情况自己增加 
 * @author wangqq
 * 
 */  
public class UserInfo implements UserDetails {  
    private static final long serialVersionUID = -1041327031937199938L;  
  
    /** 
     * 用户ID 
     */  
    private String id;  
  
    /** 
     * 用户名称 
     */  
    private String name;  
  
    /** 
     * 登录名称 
     */  
    private String username;  
    
    
    /**
     * 描述信息
     */
    private String description;
    
    /**
     * 注册时间
     */
    private Date regTime;// 注册时间
    
    /**
     * 模块，功能权限
     */
    private List<FwPlModule> modules;//所拥有的权限
    
  
    /** 
     * 登录密码 
     */  
    private String password;  
  
    private boolean isAccountNonExpired = true;  
  
    private boolean isAccountNonLocked = true;  
  
    private boolean isCredentialsNonExpired = true;  
  
    private boolean isEnabled = true;  
  
    private Set<AuthorityInfo> authorities = new HashSet<AuthorityInfo>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	public void setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Set<AuthorityInfo> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<AuthorityInfo> authorities) {
		this.authorities = authorities;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public List<FwPlModule> getModules() {
		return modules;
	}
	
	/**
	 * 根据parentId获取所有的子ID
	 * @param parentId
	 * @return
	 */
	public List<FwPlModule> getNextModules(String parentId) {
		List<FwPlModule> nextModules = Lists.newArrayList();
		for(FwPlModule flModule : this.getModules()){
			if(flModule.getParentId().equals(parentId)){
				nextModules.add(flModule);
			}
		}
		return nextModules;
	}
	/**
	 * 根据ID查找名称
	 * @param id
	 * @return
	 */
	private String getModuleNameById(String Id) {
		String name="";
		for(FwPlModule flModule : this.getModules()){
			if(flModule.getId().equals(Id)){
				name = flModule.getModuleName();
				break;
			}
		}
		return name;
	}
	
	/**
	 * 根据模块ID获取导航信息
	 * @param modules
	 * @return
	 */
	public String getNavInfos(FwPlModule params){
		List<String> list = Lists.newArrayList();
		String parentIds = params.getParentIds();
		//如果不为空
		if(!StringUtils.isEmpty(parentIds)){
			String []pars = parentIds.split(",");
			if(pars.length > 2){
				for(int i=2;i<pars.length;i++){
					list.add(getModuleNameById(pars[i]));
				}
			}
		}
		list.add(params.getModuleName());
		Joiner joiner = Joiner.on(",").skipNulls();
		joiner.join(list.iterator());
		return joiner.join(list.iterator());
	}
	
	/**
	 * 设置模块权限
	 * @param modules
	 */
	public void setModules(List<FwPlModule> modules) {
		this.modules = Lists.newArrayList();
		this.modules.addAll(modules);
	}  
	
	
	public static void main(String[] args) {
		//Joiner joiner = Joiner.on(",").skipNulls();
		//System.out.println(joiner.toString());
		//System.out.println(joiner.join("Harry","11"));
	}
    
}
