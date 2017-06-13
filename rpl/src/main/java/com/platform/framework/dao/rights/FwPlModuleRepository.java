package com.platform.framework.dao.rights;

import javax.persistence.Table;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.platform.framework.entity.rights.FwRightRole;
  
  
@Repository  
@Table(name="fw_pl_module")   
public interface FwPlModuleRepository extends PagingAndSortingRepository<FwRightRole,String>{     
    
}  