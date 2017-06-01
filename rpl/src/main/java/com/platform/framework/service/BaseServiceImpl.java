package com.platform.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.framework.dao.BaseDao;




/**
 * 
  * <p>类描述：平台系统，服务层，基类实现类。其他平台所有的业务实现类都要继承此实现类  </p>	
  * @author 王求卿[wangqiuqing] Tel:18101037995
  * @createDate 2016-6-1 上午11:39:33
 */
@Service
public class BaseServiceImpl extends AbstractService implements BaseService {

	@Autowired
	private BaseDao baseDao;
	/**
	 * 
	  * <p>功能描述：获取对应baseDao实现类的接口。</p>	
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期:2014-4-16 下午4:01:59。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	public BaseDao getDao() {
		return baseDao;
	}
	/**
	 * 
	  * <p>功能描述：设置对应baseDao实现类的接口。</p>	
	  * @param baseDao
	  * @since JDK1.6。
	  * <p>创建日期:2014-4-16 下午4:02:07。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	public void setDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	
}
