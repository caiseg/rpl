package com.platform.framework.entity.rights;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FwPlModule entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_PL_MODULE")
public class FwPlModule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6485078306545238980L;
	// Fields
	private String id;
	private String systemId;
	private String moduleName;
	private String permission;//权限控制
	private String isMenu;//是否是菜单
	private Integer sort;//排序字段
	private String isEnable;//是否可见
	
	private String moduleLevel;
	private String parentId;
	private String parentIds;//parentIds,便于前台迭代查询
	
	
	private String iconCls;
	private String moduleLink;
	
	private String isDeleted;
	private String createUserCode;
	private String createUserName;
	private Date createTime;
	private String updateUserCode;
	private String updateUserName;
	private Date updateTime;
	private String remark;
	private String openType;

	/**
	 * 模块所对应的服务IP
	 */
	private String serverId;
	

	// Constructors
    //public String iconPosition="top";
    
    
	/**
	 * iconPosition
	 *
	 * @return  the iconPosition
	 * @since   CodingExample Ver(编码[bian ma]范例[fan li]查看) 1.0
	 */
//	
//	public String getIconPosition() {
//		return iconPosition;
//	}
	/** default constructor */
	public FwPlModule() {
	}

	public FwPlModule(String id, String systemId, String moduleName,
			String permission, String isMenu, Integer sort, String isEnable,
			String moduleLevel, String parentId, String iconCls,
			String moduleLink, String isDeleted, String createUserCode,
			String createUserName, Date createTime, String updateUserCode,
			String updateUserName, Date updateTime, String remark,
			String openType, String serverId) {
		super();
		this.id = id;
		this.systemId = systemId;
		this.moduleName = moduleName;
		this.permission = permission;
		this.isMenu = isMenu;
		this.sort = sort;
		this.isEnable = isEnable;
		this.moduleLevel = moduleLevel;
		this.parentId = parentId;
		this.iconCls = iconCls;
		this.moduleLink = moduleLink;
		this.isDeleted = isDeleted;
		this.createUserCode = createUserCode;
		this.createUserName = createUserName;
		this.createTime = createTime;
		this.updateUserCode = updateUserCode;
		this.updateUserName = updateUserName;
		this.updateTime = updateTime;
		this.remark = remark;
		this.openType = openType;
		this.serverId = serverId;
	}

	/** minimal constructor */
	public FwPlModule(String id) {
		this.id = id;
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

	@Column(name = "SYSTEM_ID", length = 300)
	public String getSystemId() {
		return this.systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	@Column(name = "MODULE_NAME", length = 300)
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	
	@Column(name = "PERMISSION", length = 100)
	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	@Column(name = "MODULE_LEVEL", length = 100)
	public String getModuleLevel() {
		return this.moduleLevel;
	}

	public void setModuleLevel(String moduleLevel) {
		this.moduleLevel = moduleLevel;
	}

	@Column(name = "PARENT_ID", length = 300)
	public String getParentId() {
		return this.parentId;
	}
	
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	

	
	@Column(name = "PARENT_IDS", length = 600)
	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}


	@Column(name = "ICON_CLS", length = 600)
	public String getIconCls() {
		return this.iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	@Column(name = "MODULE_LINK", length = 300)
	public String getModuleLink() {
		return this.moduleLink;
	}

	public void setModuleLink(String moduleLink) {
		this.moduleLink = moduleLink;
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
	@Column(name = "OPEN_TYPE", length = 100)
	public String getOpenType() {
		return openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}
	
	@Column(name = "SERVER_ID", length = 300)
	public String getServerId() {
		return serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
	@Column(name = "IS_MENU", length = 2)
	public String getIsMenu() {
		return isMenu;
	}

	public void setIsMenu(String isMenu) {
		this.isMenu = isMenu;
	}

	@Column(name = "SORT")
	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	
	
	
	

}