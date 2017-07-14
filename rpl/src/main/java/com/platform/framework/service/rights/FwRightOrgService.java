package com.platform.framework.service.rights;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.platform.common.bean.Message;
import com.platform.framework.dao.rights.FwRightOrgRepository;
import com.platform.framework.entity.rights.FwRightOrg;
import com.platform.framework.service.BaseServiceImpl;

/**
 * 
  * 组织机构类
  * @author 王求卿[wangqiuqing] Tel:18101037995
  * @createDate 2017-7-7 下午1:49:15
 */
@Service
public class FwRightOrgService extends BaseServiceImpl {
	/**
	 * 标准的增删改查分页接口
	 */
	@Autowired
	FwRightOrgRepository fwRightOrgRepository;
	
	
	/**
	 * 
	  * 保存组织机构 	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param fwRightOrg
	  * @return 组织机构ID
	  * @createDate 2017-7-13 上午9:44:55
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public String saveOrg(FwRightOrg fwRightOrg){
		try{
			fwRightOrgRepository.save(fwRightOrg);
		}catch (Exception e) {
			return new Message(Message.ERROR, "添加组织机构失败").toJson();
		}
		return new Message(Message.OK, fwRightOrg.getId()).toJson();
	}
	
	/**
	 * 
	  * 更新组织机构 	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param fwRightOrg
	  * @return
	  * @createDate 2017-7-13 上午9:45:03
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public String updateOrg(FwRightOrg fwRightOrg){
		if(fwRightOrgRepository.exists(fwRightOrg.getId())){
			fwRightOrgRepository.save(fwRightOrg);
		}
		return new Message(Message.OK, fwRightOrg.getId()).toJson();
	}
	
	public String deleteOrg(String ids){
		String[] idArr = ids.split(",");
		int lens = idArr.length;
		for(int i=0;i<lens;i++){
			fwRightOrgRepository.delete(idArr[i]);
		}
		return lens+"";
	}

	/**
	 * 
	  * 查询所有组织机构	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @return 未被删除的组织机构
	  * @createDate 2017-7-7 下午1:47:58
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public List<FwRightOrg> getAllOrgInfo(){
		return fwRightOrgRepository.findByisDeleted("0");//查询未被删除的组织机构
	}
	
	
	/**
	 * 
	  * 查询所有组织机构的，最小单元 	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @return
	  * @throws Exception 
	  * @createDate 2017-7-7 下午1:52:49
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public List<Map> getAllOrgMap() throws Exception{
		List<Map> list = this.getDao().findBySql("select id,org_name,parent_id,org_level,sort from fw_right_org where is_deleted = '0'",Map.class);
		return list;
	}
	
	

	
	/**
	 * 
	  * 根据查询字符串以及分页的条件 。查询分页的数据	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param searchCtx
	  * @param pageable
	  * @return 分页数据
	  * @throws Exception 
	  * @createDate 2017-7-10 上午9:21:15
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public Page<FwRightOrg> findOrgPage(String searchCtx, Pageable pageable) throws Exception {
		
		if(StringUtils.isEmpty(searchCtx)){
			searchCtx = "";
		}

		return super.getDao().findEntityPagingBySql("select * from FW_RIGHT_ORG where org_code like '%"+searchCtx+"%' or org_name like '%"+searchCtx+"%'", null, pageable, FwRightOrg.class);
	}

	/**
	 * 
	  * 查询当前节点以及子节点信息	
	  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
	  * @param parentId
	  * @param pageable
	  * @return
	  * @throws Exception
	  * @createDate 2017-7-13 上午9:43:44
	  * @update:[日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public Page<FwRightOrg> findParentPage(String parentId, Pageable pageable) throws Exception{
		return super.getDao().findEntityPagingBySql("select * from FW_RIGHT_ORG where id= '"+parentId+"' or parent_id = '"+parentId+"'", null, pageable, FwRightOrg.class);
	}

	

}
