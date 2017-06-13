package com.platform.framework.service.rights;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.framework.dao.rights.FwPlModuleRepository;
import com.platform.framework.entity.rights.FwPlModule;
import com.platform.framework.service.BaseServiceImpl;

/**
 * 实现业务层
 * 
 * @author Administrator
 * 
 */
@Service
public class FwPlModuleService extends BaseServiceImpl {
	
	@Autowired
	FwPlModuleRepository fwPlModuleRepository;

	
	
	/**
	 * 根据userId 查询所对应的权限信息
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public List<FwPlModule> getModulesByUserId(String userId) throws Exception{
		//过滤role包含了重复的权限
		String sql = "select DISTINCT a.* from fw_pl_module a left join  fw_right_role_module_ref b on a.id = b.module_id left join fw_right_role_user_ref c on b.role_id = c.role_id where c.user_id ='"+userId+"'";
		return super.getDao().findBySql(sql, FwPlModule.class);
	}


}
