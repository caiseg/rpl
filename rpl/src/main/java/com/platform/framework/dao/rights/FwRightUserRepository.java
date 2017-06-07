package com.platform.framework.dao.rights;

import javax.persistence.Table;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.platform.framework.entity.rights.FwRightUser;
  
  
@Repository  
@Table(name="fw_right_user")   
public interface FwRightUserRepository extends PagingAndSortingRepository<FwRightUser,String>{  
  
	
	/**
	 * 根据userCode查询用户信息
	 * @param userCode
	 * @return
	 */
    FwRightUser findByUserCode(String userCode);  
    
    
    
    
}  