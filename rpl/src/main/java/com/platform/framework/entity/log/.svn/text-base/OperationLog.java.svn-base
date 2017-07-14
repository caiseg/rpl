package com.platform.framework.entity.log;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 操作日志 Entity
 * @author wangqq
 *
 */
@Entity
@Table(name = "fw_operation_log")
public class OperationLog {
	
	public static final String OPERATE_TYPE_ADD = "1";
	public static final String OPERATE_TYPE_DELETE = "2";
	public static final String OPERATE_TYPE_UPDATE ="3";
	
	private String id;			// 日志编号ID
	private String moduleType; // 模块类型,描述字段,记录当前操作的表名
	private String operateUserId;	// 操作用户ID
	private Date operateDate;	// 操作时间
	private String operateType; //操作类别（新增、修改、删除）
	private String content;		//操作内容
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getModuleType() {
		return moduleType;
	}
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}
	public String getOperateUserId() {
		return operateUserId;
	}
	public void setOperateUserId(String operateUserId) {
		this.operateUserId = operateUserId;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")	
	public Date getOperateDate() {
		return operateDate;
	}
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}
	public String getOperateType() {
		return operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
