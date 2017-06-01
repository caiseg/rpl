package com.platform.framework.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Dao {
	
	
	
	public <T> List<T> findBySql(String sql)throws Exception;
	
	public <T> List<T> findBySql(String sql,Object[] params)throws Exception;

	/**
	 * 根据原生SQL查询对应的集合
	 * 
	 * @param sql
	 * @param parameters
	 * @return List
	 * @throws Exception
	 */
	public List<Map<String, Object>> findMapListBySql(final String sql,
			final Object[] parameters) throws Exception;

	/**
	 * 
	  * <p>功能描述:根据实体查询进行分页查询。</p>	
	  * @param pagingDataList
	  * @param clazz
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期2014-4-28 上午11:21:30。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	public <T> Page<T> findEntityPagingBySql(String Sql,Object[] params,Pageable pageable, Class<T> clazz)throws Exception;

	public <T> List<T> findBySql(String sql, Class<T> clazz) throws Exception;

	public <T>  List<T> findBySql(String sql, Object[] params, Class<T> clazz)
			throws Exception;

}
