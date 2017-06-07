package com.platform.framework.entity.rights;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FwRightRoleModuleoptRef entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_RIGHT_ROLE_MODULEOPT_REF")
public class FwRightRoleModuleoptRef implements java.io.Serializable {

	// Fields

	private String id;
	private String roleId;
	private String moduleoperationId;

	// Constructors

	/** default constructor */
	public FwRightRoleModuleoptRef() {
	}

	/** minimal constructor */
	public FwRightRoleModuleoptRef(String id) {
		this.id = id;
	}

	/** full constructor */
	public FwRightRoleModuleoptRef(String id, String roleId,
			String moduleoperationId) {
		this.id = id;
		this.roleId = roleId;
		this.moduleoperationId = moduleoperationId;
	}

	// Property accessors
	@Id
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

	@Column(name = "MODULEOPERATION_ID", length = 300)
	public String getModuleoperationId() {
		return this.moduleoperationId;
	}

	public void setModuleoperationId(String moduleoperationId) {
		this.moduleoperationId = moduleoperationId;
	}

}