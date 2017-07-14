package com.platform.framework.entity.rights;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FwPlServer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_PL_SERVER")
public class FwPlServer implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3308374714959773608L;
	private String id;
	private String serverCode;
	private String serverName;
	private String serverIp;
	private String serverPort;
	private String isMain;
	private String createUserCode;
	private String createUserName;
	private Date createTime;
	private Date updateTime;
	private String updateUserCode;
	private String updateUserName;
	private String remark;

	// Constructors

	/** default constructor */
	public FwPlServer() {
	}

	/** minimal constructor */
	public FwPlServer(String id, String serverCode, String serverName,
			String serverIp, String isMain) {
		this.id = id;
		this.serverCode = serverCode;
		this.serverName = serverName;
		this.serverIp = serverIp;
		this.isMain = isMain;
	}

	/** full constructor */
	public FwPlServer(String id, String serverCode, String serverName,
			String serverIp, String serverPort, String isMain,
			String createUserCode, String createUserName, Date createTime,
			Date updateTime, String updateUserCode, String updateUserName,
			String remark) {
		this.id = id;
		this.serverCode = serverCode;
		this.serverName = serverName;
		this.serverIp = serverIp;
		this.serverPort = serverPort;
		this.isMain = isMain;
		this.createUserCode = createUserCode;
		this.createUserName = createUserName;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.updateUserCode = updateUserCode;
		this.updateUserName = updateUserName;
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

	@Column(name = "SERVER_CODE", nullable = false, length = 100)
	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	@Column(name = "SERVER_NAME", nullable = false, length = 300)
	public String getServerName() {
		return this.serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	@Column(name = "SERVER_IP", nullable = false, length = 300)
	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	@Column(name = "SERVER_PORT", length = 100)
	public String getServerPort() {
		return this.serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	@Column(name = "IS_MAIN", nullable = false, length = 2)
	public String getIsMain() {
		return this.isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME", length = 7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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

	@Column(name = "REMARK", length = 1000)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}