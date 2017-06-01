package com.platform.framework.service;

import com.platform.framework.dao.BaseDao;






/**
 * 
  *<p>类描述：平台系统，服务层，基类接口。其他平台所有的业务接口都要继承此接口。</p>
  * @author 王求卿[wangqiuqing] Email:455654995@qq.com Tel:18101037995
  * @version: v1.0.0.1。
  * @since JDK1.6。
  *<p>创建日期：2014-4-28 上午10:42:58。</p>
 */
public interface BaseService extends Service {
	/**
	 * 
	  * <p>功能描述：获取对应baseDao实现类的接口。</p>	
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期:2014-4-16 下午4:01:59。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	public BaseDao getDao();
	/**
	 * 
	  * <p>功能描述：设置对应baseDao实现类的接口。</p>	
	  * @param baseDao
	  * @since JDK1.6。
	  * <p>创建日期:2014-4-16 下午4:02:07。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	public void setDao(BaseDao baseDao);
}
