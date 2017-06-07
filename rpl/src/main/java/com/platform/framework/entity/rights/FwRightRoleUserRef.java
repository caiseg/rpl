package com.platform.framework.entity.rights;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FwRightRoleUserRef entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_RIGHT_ROLE_USER_REF")
public class FwRightRoleUserRef implements java.io.Serializable {

	// Fields

	private String id;
	private String userId;
	private String roleId;

	// Constructors

	/** default constructor */
	public FwRightRoleUserRef() {
	}

	/** minimal constructor */
	public FwRightRoleUserRef(String id) {
		this.id = id;
	}

	/** full constructor */
	public FwRightRoleUserRef(String id, String userId, String roleId) {
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
	}

	// Property accessors
	@Id
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "USER_ID", length = 300)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "ROLE_ID", length = 300)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}