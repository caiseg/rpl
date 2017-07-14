package com.platform.framework.entity.rights;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FwPlSystem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_PL_SYSTEM")
public class FwPlSystem implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	
	 /**
	  * serialVersionUID:TODO（用一句话描述这个变量[bian liang]表示什么）
	  *
	  * @since Ver 1.1
	  */
	private String id;//系统ID
	private String systemCode;//系统编码
	private String systemName;//系统名称
	private String iconCls;
	private String systemLogo;
	private String systemIndexPage;
	private String openUrl;//打开的URL
	private String openType;//打开的类型,  弹出，整体替换,iframe嵌入
	
	private String isEnabled;
	private String isDeleted;
	private String createUserCode;
	private String createUserName;
	private Date createTime;
	private String updateUserCode;
	private String updateUserName;
	private Date updateTime;
	private String remark;
	
    private String  serverId;//所属服务器ID
    private String  tabIndexPage;
	/** default constructor */
	public FwPlSystem() {
	}

	/** minimal constructor */
	public FwPlSystem(String id) {
		this.id = id;
	}

	/** full constructor */
	public FwPlSystem(String id, String systemCode, String systemName,
			String iconCls, String systemLogo, String systemIndexPage,
			String openUrl, String openType,
			String isEnabled, String isDeleted, String createUserCode,
			String createUserName, Date createTime, String updateUserCode,
			String updateUserName, Date updateTime, String remark,String serverId,String tabIndexPage) {
		this.id = id;
		this.systemCode = systemCode;
		this.systemName = systemName;
		this.iconCls = iconCls;
		this.systemLogo = systemLogo;
		this.systemIndexPage = systemIndexPage;
		this.openUrl = openUrl;
		this.openType = openType;
		this.isEnabled = isEnabled;
		this.isDeleted = isDeleted;
		this.createUserCode = createUserCode;
		this.createUserName = createUserName;
		this.createTime = createTime;
		this.updateUserCode = updateUserCode;
		this.updateUserName = updateUserName;
		this.updateTime = updateTime;
		this.remark = remark;
		this.serverId = serverId;
		this.tabIndexPage = tabIndexPage;  //默认进入的页面链接
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 40)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "SYSTEM_CODE", length = 300)
	public String getSystemCode() {
		return this.systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	@Column(name = "SYSTEM_NAME", length = 300)
	public String getSystemName() {
		return this.systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	@Column(name = "ICON_CLS", length = 600)
	public String getIconCls() {
		return this.iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	@Column(name = "SYSTEM_LOGO", length = 600)
	public String getSystemLogo() {
		return this.systemLogo;
	}

	public void setSystemLogo(String systemLogo) {
		this.systemLogo = systemLogo;
	}

	@Column(name = "SYSTEM_INDEX_PAGE", length = 600)
	public String getSystemIndexPage() {
		return this.systemIndexPage;
	}

	public void setSystemIndexPage(String systemIndexPage) {
		this.systemIndexPage = systemIndexPage;
	}

	@Column(name = "OPEN_URL", length = 200)
	public String getOpenUrl() {
		return this.openUrl;
	}

	public void setOpenUrl(String openUrl) {
		this.openUrl = openUrl;
	}

	@Column(name = "OPEN_TYPE", length = 100)
	public String getOpenType() {
		return this.openType;
	}

	public void setOpenType(String openType) {
		this.openType = openType;
	}


	@Column(name = "IS_ENABLED", length = 10)
	public String getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	@Column(name = "IS_DELETED", length = 10)
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
	@Column(name = "SERVER_ID", length = 100)
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	@Column(name = "TAB_INDEX_PAGE", length = 600)
	public String getTabIndexPage() {
		return tabIndexPage;
	}

	public void setTabIndexPage(String tabIndexPage) {
		this.tabIndexPage = tabIndexPage;
	}
}