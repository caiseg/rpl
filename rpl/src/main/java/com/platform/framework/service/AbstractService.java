package com.platform.framework.service;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

import com.platform.common.cache.FwHttpSession;
import com.platform.common.security.UserInfo;
import com.platform.framework.dao.Dao;
import com.platform.framework.dao.log.FwOperationLogRepository;
import com.platform.framework.entity.log.OperationLog;




 /**
 *<p>类描述：整个系统，服务层，基类实现类。所有的子系统服务层基类都要继承此实现类。</p>
 * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
 * @version: v1.0.0.1。
 * @since JDK1.6。
 *<p>创建日期：2014-4-28 上午9:17:49。</p>
 */

public abstract class AbstractService implements Service{
	//-------------部署模式为分布式soa部署模式和传统三层action、service、dao部署模式
	protected static final Log logger = 
			LogFactory.getLog(AbstractService.class);

	public static final String OPERATE_TYPE_ADD = "1";
	public static final String OPERATE_TYPE_DELETE = "2";
	public static final String OPERATE_TYPE_UPDATE ="3";
	
	@Autowired
	private FwOperationLogRepository fwOperationLogRepository;
	
	
	public FwOperationLogRepository getLogDao() {
		return fwOperationLogRepository;
	}
	
	public void setFwOperationLogRepository(
			FwOperationLogRepository fwOperationLogRepository) {
		this.fwOperationLogRepository = fwOperationLogRepository;
	}
	
	
	
	/**
	 * 
	  * <p>功能描述:在service层获取会话(HttpSession)。</p>	
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期2014-4-28 上午10:51:10。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	@Override
	public HttpSession getHttpSession() {
		return FwHttpSession.httpSession();
	}
	
	/**
	 * 
	  * <p>功能描述:随机生成一个uuid。</p>	
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期2014-4-28 上午10:52:14。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	@Override
	public String getUUID() {
		   String s = UUID.randomUUID().toString(); 
	        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24); 
	}
	
	/**
	 * 获取一条新的字典操作日志
	 * @return
	 */
	@Transactional(readOnly = false)
	public OperationLog getOperationLog(String oType,String tableNames,String content){
		OperationLog ol = new OperationLog();
		ol.setId(this.getUUID());
		ol.setModuleType(tableNames);
		ol.setOperateUserId(this.getUserId());
		ol.setOperateDate(new Date());
		ol.setOperateType(oType);
		ol.setContent(content);
		return ol;
	}
	
	/**
	 * 获取用户主键
	 * @return
	 */
	public String getUserId() {
		if(null != getUserEntity()){
			return getUserEntity().getId();
		}
		return null;
	}



	/**
	 * 获取用户对象
	 * @return
	 */
	@Override
	public UserInfo getUserEntity() {
		UserInfo userInfo = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		  if (principal instanceof UserInfo) {
			 userInfo = (UserInfo)principal;
	      }
		return userInfo;
	}

	/**
	 * 获取用户编码
	 * @return
	 */
	@Override
	public String getUserCode() {
		if(null != getUserEntity()){
			return getUserEntity().getUsername();
		}
		return null;
	}
	
	/**
	 * 获取用户名称
	 */
	@Override
	public String getUserName(){
		if(null != getUserEntity()){
			return getUserEntity().getName();
		}
		return null;
	}
	
	
	/**
	 * 
	  * <p>功能描述:调用各子系统的DAO。</p>	
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期2014-5-19 下午4:34:38。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	public abstract Dao getDao();
}
