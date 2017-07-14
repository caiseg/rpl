package com.platform.framework.service.rights;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.platform.framework.dao.rights.FwRightRoleRepository;
import com.platform.framework.entity.rights.FwRightRole;
import com.platform.framework.service.BaseServiceImpl;

/**
 * 实现业务层
 * 
 * @author Administrator
 * 
 */
@Service
public class FwRightRoleService extends BaseServiceImpl {

	/**
	 * 标准的增删改查分页接口
	 */
	@Autowired
	FwRightRoleRepository fwRightRoleRepository;

	
	/**
	 * 调用原生SQL进行查询
	 * @return
	 * @throws Exception
	 */
	public Page<Map> findNativeSql(Pageable pageable) throws Exception {
		return super.getDao().findEntityPagingBySql("select * from base_datathird_dic", null, pageable, Map.class);
	}
	
	/**
	 * 根据userCode 查询所对应的角色信息
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public List<FwRightRole> getRolesByUserCode(String userCode) throws Exception{
		String sql  = "SELECT a.* FROM FW_RIGHT_ROLE  a LEFT JOIN FW_RIGHT_ROLE_USER_REF b ON a.ID = b.ROLE_ID LEFT JOIN fw_right_user c ON b.USER_ID = c.id where c.USER_CODE='"+userCode+"'";
		return super.getDao().findBySql(sql, FwRightRole.class);
	}
	
	/**
	 * 调用原生SQL进行查询
	 * @return
	 * @throws Exception
	 */
	public List<Map<String, Object>> findNativeSql() throws Exception {
		return super.getDao().findMapListBySql("select * from base_datathird_dic", null);
	}

	public Page<FwRightRole> findRolePage(String roleName, Pageable pageable) {

		return fwRightRoleRepository.findByRoleNameLike('%' + roleName + "%",
				pageable);
	}

	/**
	 * 查询当前角色信息
	 * 
	 * @param roleName
	 * @return
	 * @throws Exception
	 */
	public FwRightRole findFwRightOrgByName(String roleName) throws Exception {
		FwRightRole fwRightRole = fwRightRoleRepository
				.findRoleByName(roleName);
		return fwRightRole;
	}

	/**
	 * 查询角色列表
	 * 
	 * @param roleName
	 * @return
	 * @throws Exception
	 */
	public List<FwRightRole> findFwRightListByName(String roleName)
			throws Exception {
		List<FwRightRole> fwRightRoleList = fwRightRoleRepository
				.findRoleListByName("%" + roleName + "%");
		return fwRightRoleList;
	}

	/**
	 * 保存角色
	 * 
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int saveRole() throws Exception {
		
		
		//日志操作
		this.getLogDao().save(this.getOperationLog(OPERATE_TYPE_ADD, "日志表", "测试日志信息。"));
		return 1;
	}

}
