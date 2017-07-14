package com.platform.framework.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Order;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.util.StringUtils;
import com.platform.common.config.SystemConfig;

public abstract class AbstractDao implements Dao{
	
	@Autowired
	SystemConfig systemConfig;
	
	@PersistenceContext
	protected EntityManager em;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> findMapListBySql(String sql,final Object[] parameters) throws Exception {
		return this.jdbcTemplate.queryForList(sql, parameters);
	}
	
	/**
	 * 
	 * <p>功能描述:使用原生sql语句进行查询。</p>	
	 * @param sql
	 * @return
	 * @since JDK1.6。
	 * <p>创建日期2014-4-28 上午10:14:25。</p>
	 * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	@Override
	public <T> List<T> findBySql(String sql)throws Exception {
		return this.findBySql(sql, new Object[]{});
		
	}
	
	/**
	  * <p>功能描述：使用原生sql语句进行查询,params使用占位符自动设置值。</p>	
	  * @param sql
	  * @param params
	  * @return
	  * @throws SystemException
	  * @since JDK1.6。
	  * <p>创建日期:2014-6-18 上午11:36:23。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findBySql(String sql,Object[] params)throws Exception {
			Query query = em.createNativeQuery(sql);
			for (int i = 0 ; i < params.length ; i++){
				query.setParameter(i, params[i]);
			}
			return query.getResultList();
	}
	
	/**
	 * 
	  * <p>功能描述:根据sql及返回值实体类型,查询数据。</p>	
	  * @param sql sql语句中字段如果使用别名，请注意别名和javaBean对应的属性转换规则是按照hibernate生成实体规则进行的。如： 下划线去掉，下划线后的第一个字符大写
	  * @param clazz
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期2014-4-28 上午10:14:30。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	@Override
	public <T> List<T> findBySql(String sql,Class<T> clazz)throws Exception {
		return this.findBySql(sql, new Object[]{}, clazz);
	}
	
	/**
	 * 
	  * <p>功能描述:根据sql及返回值实体类型，params使用占位符自动设置值，查询数据。</p>	
	  * @param sql sql语句中字段如果使用别名，请注意别名和javaBean对应的属性转换规则是按照hibernate生成实体规则进行的。如： 下划线去掉，下划线后的第一个字符大写
	  * @param clazz
	  * @return
	  * @since JDK1.6。
	  * <p>创建日期2014-4-28 上午10:14:30。</p>
	  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findBySql(String sql,Object[] params,Class<T> clazz)throws Exception {
			if (clazz.getName().toLowerCase().equals("java.util.map") || clazz.newInstance() instanceof Map){
				return (List<T>)jdbcTemplate.queryForList(sql,params);
			}
			return jdbcTemplate.query(sql, params, new BeanPropertyRowMapper(clazz));
	}

	@Override
	public <T> Page<T> findEntityPagingBySql(String Sql,Object[] params,Pageable pageable, Class<T> clazz)
			throws Exception {
		 Page<T> page =  null;
		 try {
			 	
				String tempSql = "";
				String sortFiled = "";
				String sortOrder = "";
				if(pageable.getSort().iterator().hasNext()){
					Order order = pageable.getSort().iterator().next();
					sortOrder = order.getDirection().name();
					sortFiled=order.getProperty();
				}
				
				if (pageable.getPageNumber() == 0) {
					if(systemConfig.getDbType().equals("oracle")){
						tempSql = "SELECT A.* FROM (" + Sql + ") A WHERE ROWNUM <= "
								+ pageable.getPageSize();
					}else if(systemConfig.getDbType().equals("mysql")){
						
						if(!StringUtils.isEmpty(sortOrder)){
							tempSql = Sql+ " order by " +sortFiled+" "+sortOrder+ " limit "+0+","+pageable.getPageSize();
						}else{
							tempSql = Sql+ " limit "+0+","+pageable.getPageSize();
						}
					}
					
					
				} else {
					
					if(systemConfig.getDbType().equals("oracle")){
						tempSql = "SELECT * FROM (SELECT A.*,ROWNUM R FROM (" + Sql
								+ ") A WHERE ROWNUM <= " + ((pageable.getPageNumber()+1) * pageable.getPageSize())
								+ ") B WHERE B.R > " + (pageable.getPageNumber()*pageable.getPageSize());
					}else if(systemConfig.getDbType().equals("mysql")){
						
						if(!StringUtils.isEmpty(sortOrder)){
							tempSql = Sql+ " order by " +sortFiled+" "+sortOrder+ " limit "+((pageable.getPageNumber()) * pageable.getPageSize())+","+pageable.getPageSize();
						}else{
							tempSql = Sql+ " limit "+((pageable.getPageNumber()) * pageable.getPageSize())+","+pageable.getPageSize();
						}
						
					}
					
				
				}
				System.out.println(tempSql);
				if(systemConfig.getDbType().equals("oracle")){
					if (!sortFiled.equals("") && sortFiled.indexOf(".")==-1){
						tempSql+= " order by "+sortFiled+" "+sortOrder;
					}
				}
				List dataList = this.findBySql(tempSql,params,clazz);
				long count = 0;
				if (dataList != null && dataList.size() > 0) {
					count = queryMaxCount(Sql,params);
				}
				page = new PageImpl<T>(dataList, pageable, count);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return page;
	}
	
	 /**
	    * 
	     * <p>功能描述：查询分页最大条数。</p>	
	     * @param sql
	     * @return
	     * @throws SystemException
	     * @since JDK1.6。
	     * <p>创建日期:2014-5-28 上午9:20:39。</p>
	     * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
	    */
		protected int queryMaxCount(String sql) throws Exception {
			
			return this.queryMaxCount(sql, new Object[]{});
		}
		/**
		  * <p>功能描述：查询分页最大条数。</p>	
		  * @param sql
		  * @param params
		  * @return
		  * @throws SystemException
		  * @since JDK1.6。
		  * <p>创建日期:2014-6-18 上午11:42:24。</p>
		  * <p>更新日期:[日期YYYY-MM-DD][更改人姓名][变更描述]。</p>
		 */
		protected int queryMaxCount(String sql,Object[] params) throws Exception {
			int count = 0;
			if(sql.indexOf("DISTINCT") != -1 || sql.indexOf("distinct") != -1){
				count = this.jdbcTemplate.queryForList(sql,params).size();
			}else{
				String tempsql = "SELECT COUNT(1) from ("+sql+") cta" ;
				count = this.jdbcTemplate.queryForObject(tempsql,params, Integer.class);
			}
			return count;
		}
	

}
