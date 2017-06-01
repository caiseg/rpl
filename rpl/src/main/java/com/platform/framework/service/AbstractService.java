package com.platform.framework.service;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.platform.common.cache.FwHttpSession;
import com.platform.framework.dao.Dao;




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
		return java.util.UUID.randomUUID().toString();
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
