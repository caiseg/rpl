package com.platform.framework.dao.rights;

import java.util.List;

import javax.persistence.Table;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.platform.framework.entity.rights.FwRightRole;
  
  
@Repository  
@Table(name="fw_right_role")   
public interface FwRightRoleRepository extends PagingAndSortingRepository<FwRightRole,String>{  
  
	Page<FwRightRole> findByRoleNameLike(String roleName, Pageable pageable);
	
	@Query("select t from FwRightRole t where t.roleName =:name")  
    public FwRightRole findRoleByName(@Param("name") String name);  
    
    
    @Query("select t from FwRightRole t where t.roleName like :name")  
    public List<FwRightRole> findRoleListByName(@Param("name") String name);  
    
    
}  