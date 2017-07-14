package com.platform.framework.dao.rights;

import java.util.List;

import javax.persistence.Table;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.platform.framework.entity.rights.FwRightOrg;
  
  
@Repository  
@Table(name="FW_RIGHT_ORG")   
public interface FwRightOrgRepository extends PagingAndSortingRepository<FwRightOrg,String>{  
    
	/**
	 * 
	  * 查询所有没被删除的组织机构 	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param isDeleted
	  * @return
	  * @createDate 2017-7-7 下午2:09:57
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Query("select t from FwRightOrg t where t.isDeleted = :isDeleted  order by t.sort")  
	List<FwRightOrg> findByisDeleted(@Param("isDeleted") String isDeleted);
	
	/**
	 * 
	  * 根据ID，查询所有子节点的ID，并排序 	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param id
	  * @param pageable
	  * @return
	  * @createDate 2017-7-7 下午2:10:20
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	@Query("select t from FwRightOrg t where t.parentId = :id  order by t.sort")  
	Page<FwRightOrg> findById(String id, Pageable pageable);
	
}  