package com.platform.framework.entity.rights;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FwRightUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_RIGHT_USER")
public class FwRightUser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private String id;// 主键ID
	private String userCode;// 用户编码 ，登录账号！
	private String userName;// 用户名字;真实名称
	private String password;// 密码
	private String userType;// 用户类型 ,表明是什么类型的用户，比如admin,guest,根据业务来
	private String email;// 邮箱
	private String telephone;// 电话
	private String orgId;// 所在组织机构
	private String isEnable;// 账号是否可用
	private String isDeleted;// 账号是否删除
	private String isOnline;// 是否在线
	private String isLocked;// 是否锁定
	private Date regTime;// 注册时间
	private String createUserCode;// 创建用户ID
	private String createUserName;// 创建用户名称
	private Date createTime;// 创建时间
	private String updateUserCode;// 更新code
	private String updateUserName;// 更新用户名称
	private Date updateTime;// 更新时间
	private String remark;// 备注

	// Constructors
	/** default constructor */
	public FwRightUser() {
	}

	/** full constructor */
	public FwRightUser(String id, String userCode, String userName,
			String password, String userType, String email, String telephone,
			String orgId, String isEnable, String isDeleted, String isOnline,
			String isLocked, Date regTime, String createUserCode,
			String createUserName, Date createTime, String updateUserCode,
			String updateUserName, Date updateTime, String remark) {
		this.id = id;
		this.userCode = userCode;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.email = email;
		this.telephone = telephone;
		this.orgId = orgId;
		this.isEnable = isEnable;
		this.isDeleted = isDeleted;
		this.isOnline = isOnline;
		this.isLocked = isLocked;
		this.regTime = regTime;
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
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "USER_CODE", length = 100)
	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Column(name = "PASSWORD", length = 300)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "USER_TYPE", length = 100)
	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Column(name = "EMAIL", length = 300)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "ORG_ID", length = 300)
	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	@Column(name = "USER_NAME", length = 300)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	@Column(name = "IS_ONLINE", length = 100)
	public String getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	@Column(name = "IS_LOCKED", length = 100)
	public String getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REG_TIME", length = 7)
	public Date getRegTime() {
		return this.regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
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

	@Temporal(TemporalType.TIMESTAMP)
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

	@Temporal(TemporalType.TIMESTAMP)
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

	@Column(name = "TELEPHONE", length = 11)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}