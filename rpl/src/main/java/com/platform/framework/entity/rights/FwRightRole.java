package com.platform.framework.entity.rights;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FwRightRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "fw_right_role")
public class FwRightRole implements java.io.Serializable {
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
	// Fields

	private String id;
	private String roleName;
	private String roleType;
	private String isEnable;
	private String isDeleted;
	private String createUserCode;
	private String createUserName;
	private Date createTime;
	private String updateUserCode;
	private String updateUserName;
	private Date updateTime;
	private String remark;


	/** default constructor */
	public FwRightRole() {
	}

	/** minimal constructor */
	public FwRightRole(String id) {
		this.id = id;
	}

	/** full constructor */
	public FwRightRole(String id, String roleName, String roleType,
			String isEnable, String isDeleted, String createUserCode,
			String createUserName, Date createTime, String updateUserCode,
			String updateUserName, Date updateTime, String remark,Integer roleReportId) {
		this.id = id;
		this.roleName = roleName;
		this.roleType = roleType;
		this.isEnable = isEnable;
		this.isDeleted = isDeleted;
		this.createUserCode = createUserCode;
		this.createUserName = createUserName;
		this.createTime = createTime;
		this.updateUserCode = updateUserCode;
		this.updateUserName = updateUserName;
		this.updateTime = updateTime;
		this.remark = remark;
	}

	// Property accessors
	@Id
	//@GenericGenerator(name="system-uuid", strategy="uuid")
	//@GeneratedValue(generator="system-uuid")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "ROLE_NAME", length = 300)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "ROLE_TYPE", length = 100)
	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	@Column(name = "IS_ENABLE", length = 100)
	public String getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	@Column(name = "IS_DELETED", length = 100)
	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
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

	@Temporal(value = TemporalType.TIMESTAMP)
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

	@Temporal(value = TemporalType.TIMESTAMP)
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


	
}