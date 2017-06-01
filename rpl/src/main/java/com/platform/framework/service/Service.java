package com.platform.framework.service;

import javax.servlet.http.HttpSession;

import com.platform.framework.dao.Dao;
 /**
 *<p>类描述：整个系统，服务层，基类接口。所有的子系统服务层基类接口都要继承此接口。</p>
 * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
 * @version: v1.0.0.1。
 * @since JDK1.6。
 *<p>创建日期：2014-4-28 上午9:13:45。</p>
 */

public interface Service {
	/**
	  * <p>功能描述:在service层获取会话(HttpSession)。</p>	
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期2014-4-28 上午10:51:10。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	public HttpSession getHttpSession();
	/**
	 * 
	  * <p>功能描述:随机生成一个uuid。</p>	
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期2014-4-28 上午10:52:14。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	public String getUUID();
	
	public Dao getDao();
}
