package com.platform.framework.dao.log;

import javax.persistence.Table;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.platform.framework.entity.log.OperationLog;
  
  
@Repository  
@Table(name="fw_operation_log")   
public interface FwOperationLogRepository extends PagingAndSortingRepository<OperationLog,String>{     
    
}  