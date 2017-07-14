package com.platform.framework.service.rights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.platform.framework.dao.rights.FwRightRoleRepository;
import com.platform.framework.dao.rights.FwRightUserRepository;
import com.platform.framework.entity.rights.FwRightRole;
import com.platform.framework.entity.rights.FwRightUser;
import com.platform.framework.service.BaseServiceImpl;

/**
 * 实现业务层
 * 
 * @author wqq
 * 
 */
@Service
public class FwRightUserService extends BaseServiceImpl {


	/**
	 * 标准的增删改查分页接口
	 */
	@Autowired
	FwRightUserRepository fwRightUserRepository;

	
	

	public Page<FwRightUser> findUserPage(String userCode, Pageable pageable) {

		return fwRightUserRepository.findByUserCodeLike('%' + userCode + "%",
				pageable);
	}

	

}
