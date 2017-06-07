package com.platform.framework.entity.rights;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FwPlModuleOperation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_PL_MODULE_OPERATION")
public class FwPlModuleOperation implements java.io.Serializable {

	// Fields

	
	 /**
	  * serialVersionUID:TODO（用一句话描述这个变量[bian liang]表示什么）
	  *
	  * @since Ver 1.1
	  */
	 
	private String id;
	private String systemId;
	private String moduleId;
	private String operationLink;
	private String operationName;
	private String iconCls;
	private BigDecimal defaultSeqNo;
	private String groupId;
	private String createUserCode;
	private String createUserName;
	private Date createTime;
	private String updateUserCode;
	private String updateUserName;
	private Date updateTime;
	private String remark;
	private String requestUrl;
	private String optType;
	private String optContent;

	// Constructors

	/** default constructor */
	public FwPlModuleOperation() {
	}

	/** minimal constructor */
	public FwPlModuleOperation(String id) {
		this.id = id;
	}

	/** full constructor */
	public FwPlModuleOperation(String id, String systemId, String moduleId,
			String operationLink, String operationName, String iconCls,
			BigDecimal defaultSeqNo, String groupId, String createUserCode,
			String createUserName, Timestamp createTime, String updateUserCode,
			String updateUserName, Timestamp updateTime, String remark,
			String requestUrl, String optType, String optContent) {
		this.id = id;
		this.systemId = systemId;
		this.moduleId = moduleId;
		this.operationLink = operationLink;
		this.operationName = operationName;
		this.iconCls = iconCls;
		this.defaultSeqNo = defaultSeqNo;
		this.groupId = groupId;
		this.createUserCode = createUserCode;
		this.createUserName = createUserName;
		this.createTime = createTime;
		this.updateUserCode = updateUserCode;
		this.updateUserName = updateUserName;
		this.updateTime = updateTime;
		this.remark = remark;
		this.requestUrl = requestUrl;
		this.optType = optType;
		this.optContent = optContent;
	}

	// Property accessors
	@Id
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "SYSTEM_ID", length = 300)
	public String getSystemId() {
		return this.systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	@Column(name = "MODULE_ID", length = 300)
	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	@Column(name = "OPERATION_LINK", length = 300)
	public String getOperationLink() {
		return this.operationLink;
	}

	public void setOperationLink(String operationLink) {
		this.operationLink = operationLink;
	}

	@Column(name = "OPERATION_NAME", length = 100)
	public String getOperationName() {
		return this.operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	@Column(name = "ICON_CLS", length = 100)
	public String getIconCls() {
		return this.iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	@Column(name = "DEFAULT_SEQ_NO", precision = 0)
	public BigDecimal getDefaultSeqNo() {
		return this.defaultSeqNo;
	}

	public void setDefaultSeqNo(BigDecimal defaultSeqNo) {
		this.defaultSeqNo = defaultSeqNo;
	}

	@Column(name = "GROUP_ID", length = 300)
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Column(name = "CREATE_USER_CODE", length = 100)
	public String getCreateUserCode() {
		return this.createUserCode;
	}

	public void setCreateUserCode(String createUserCode) {
		this.createUserCode = createUserCode;
	}

	@Column(name = "CREATE_USER_NAME", length = 100)
	public String getCreateUserName() {
		return this.createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	@Column(name = "CREATE_TIME", length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATE_USER_CODE", length = 100)
	public String getUpdateUserCode() {
		return this.updateUserCode;
	}

	public void setUpdateUserCode(String updateUserCode) {
		this.updateUserCode = updateUserCode;
	}

	@Column(name = "UPDATE_USER_NAME", length = 100)
	public String getUpdateUserName() {
		return this.updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	@Column(name = "UPDATE_TIME", length = 7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "REMARK", length = 1000)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "REQUEST_URL", length = 300)
	public String getRequestUrl() {
		return this.requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	@Column(name = "OPT_TYPE", length = 300)
	public String getOptType() {
		return this.optType;
	}

	public void setOptType(String optType) {
		this.optType = optType;
	}

	@Column(name = "OPT_CONTENT", length = 3000)
	public String getOptContent() {
		return this.optContent;
	}

	public void setOptContent(String optContent) {
		this.optContent = optContent;
	}

}