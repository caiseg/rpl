package com.platform.common.security;
import java.util.List;
import java.util.Set;  
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.cas.authentication.CasAssertionAuthenticationToken;  
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;  
import org.springframework.security.core.userdetails.UserDetails;  
import org.springframework.security.core.userdetails.UsernameNotFoundException;  

import com.google.common.collect.Sets;
import com.platform.framework.dao.rights.FwRightUserRepository;
import com.platform.framework.entity.rights.FwRightRole;
import com.platform.framework.entity.rights.FwRightUser;
import com.platform.framework.service.rights.FwRightRoleService;

  
/** 
 * 用于加载用户信息 实现UserDetailsService接口，或者实现AuthenticationUserDetailsService接口 
 * @author wangqq 
 * 
 */  
public class CustomUserDetailsService  implements AuthenticationUserDetailsService<CasAssertionAuthenticationToken> {  
  
	@Autowired
	FwRightUserRepository fwRightUserRepository;
	
	@Autowired
	FwRightRoleService fwRightRoleService;
	
    @Override  
    public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {  
        System.out.println("当前的用户名是："+token.getName());  
        /*这里我为了方便，就直接返回一个用户信息，实际当中这里修改为查询数据库或者调用服务什么的来获取用户信息*/  
        FwRightUser fwRightUser = fwRightUserRepository.findByUserCode(token.getName());
        
        if(null == fwRightUser){
        	throw new UsernameNotFoundException("用户名不存在");
        }
        //用于管理权限的UserInfo 无任何意义
        UserInfo userInfo = new UserInfo();
        userInfo.setId(fwRightUser.getId());//设置主键
        userInfo.setName(fwRightUser.getUserName());//设置用户名称  
        userInfo.setUsername(fwRightUser.getUserCode());//设置用户编码
        userInfo.setDescription(fwRightUser.getRemark());//设置备注信息
        userInfo.setRegTime(fwRightUser.getRegTime());//设置注册时间
        
        Set<AuthorityInfo> authorities = Sets.newHashSet();
        try {
			List<FwRightRole> roles  = fwRightRoleService.getRolesByUserCode(token.getName());
			AuthorityInfo authorityInfo;
			for(FwRightRole role:roles){
				authorityInfo = new AuthorityInfo(role.getRoleName());
				authorities.add(authorityInfo);
			}
			userInfo.setAuthorities(authorities);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return userInfo;  
    }  
  
}  