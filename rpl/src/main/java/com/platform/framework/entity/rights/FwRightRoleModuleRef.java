package com.platform.framework.entity.rights;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FwRightRoleModuleRef entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_RIGHT_ROLE_MODULE_REF")
public class FwRightRoleModuleRef implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String roleId;
	private String moduleId;

	// Constructors

	/** default constructor */
	public FwRightRoleModuleRef() {
	}

	/** minimal constructor */
	public FwRightRoleModuleRef(String id) {
		this.id = id;
	}

	/** full constructor */
	public FwRightRoleModuleRef(String id, String roleId, String moduleId) {
		this.id = id;
		this.roleId = roleId;
		this.moduleId = moduleId;
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

	@Column(name = "ROLE_ID", length = 300)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Column(name = "MODULE_ID", length = 300)
	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

}