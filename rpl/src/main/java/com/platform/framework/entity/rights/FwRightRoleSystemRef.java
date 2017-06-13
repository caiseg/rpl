package com.platform.framework.entity.rights;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FwRightRoleSystemRef entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_RIGHT_ROLE_SYSTEM_REF", schema = "GDGS")
public class FwRightRoleSystemRef implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String roleId;
	private String systemId;

	// Constructors

	/** default constructor */
	public FwRightRoleSystemRef() {
	}

	/** minimal constructor */
	public FwRightRoleSystemRef(String id) {
		this.id = id;
	}

	/** full constructor */
	public FwRightRoleSystemRef(String id, String roleId, String systemId) {
		this.id = id;
		this.roleId = roleId;
		this.systemId = systemId;
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

	@Column(name = "SYSTEM_ID", length = 300)
	public String getSystemId() {
		return this.systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

}