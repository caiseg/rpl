package com.platform.framework.entity.rights;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FwRightOrg entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FW_RIGHT_ORG")
public class FwRightOrg implements java.io.Serializable {
	// Fields
	private String id;
	private String orgName;
	private String orgFullname;//全称
	private String orgCode;
	private String parentId;
	private String orgLevel;
	private String orgAddress;
	private String orgManager;
	private String linkMan;//联系人
	private String linkPhone;//联系电话
	private String isDept;//是否是机构，实际部门
	private String zipCode;//邮政编码
	private String isEnable;
	private String isDeleted;
	private String createUserCode;
	private String createUserName;
	private Date createTime;
	private String updateUserCode;
	private String updateUserName;
	private Date updateTime;
	private String remark;
	
	private String orgType;//机构类型
	private String orgNameFt;//组织机构繁体名称
	private String orgNameEn;//组织机构英文名称
	private String orgNature;//企业类型
	private String orgCategory;//行业类别
	private String orgStatus;//机构状态
	private String orgLegal;//法人代表
	private String orgCertiNo;//组织机构证号
	private String orgRegAddr;//组织机构注册地址
	private String orgIcaRegNo;//工商行政管理注册号
	private String orgTaxRegNo;//税务登记证号
	private String fax;//传真
	
	/** default constructor */
	public FwRightOrg() {
	}

	/** minimal constructor */
	public FwRightOrg(String id) {
		this.id = id;
	}
	// Property accessors
	@Id
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "ORG_NAME", length = 300)
	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	@Column(name = "ORG_CODE", length = 100)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "PARENT_ID", length = 300)
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Column(name = "ORG_LEVEL", length = 10)
	public String getOrgLevel() {
		return this.orgLevel;
	}

	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}

	@Column(name = "ORG_ADDRESS", length = 300)
	public String getOrgAddress() {
		return this.orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	@Column(name = "ORG_MANAGER", length = 100)
	public String getOrgManager() {
		return this.orgManager;
	}

	public void setOrgManager(String orgManager) {
		this.orgManager = orgManager;
	}

	@Column(name = "LINK_MAN", length = 300)
	public String getLinkMan() {
		return this.linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	@Column(name = "LINK_PHONE", length = 600)
	public String getLinkPhone() {
		return this.linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	@Column(name = "IS_DEPT", length = 100)
	public String getIsDept() {
		return this.isDept;
	}

	public void setIsDept(String isDept) {
		this.isDept = isDept;
	}

	@Column(name = "ZIP_CODE", length = 10)
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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


	@Column(name = "ORG_FULLNAME", length = 300)
	public String getOrgFullname() {
		return this.orgFullname;
	}

	public void setOrgFullname(String orgFullname) {
		this.orgFullname = orgFullname;
	}

	@Column(name = "ORG_TYPE", length = 100)
	public String getOrgType() {
		return orgType;
	}

	
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}


	@Column(name = "ORG_NAME_FT", length = 100)
	public String getOrgNameFt() {
		return orgNameFt;
	}

	public void setOrgNameFt(String orgNameFt) {
		this.orgNameFt = orgNameFt;
	}

	@Column(name = "ORG_NAME_EN", length = 100)
	public String getOrgNameEn() {
		return orgNameEn;
	}

	public void setOrgNameEn(String orgNameEn) {
		this.orgNameEn = orgNameEn;
	}

	@Column(name = "ORG_NATURE", length = 100)
	public String getOrgNature() {
		return orgNature;
	}

	public void setOrgNature(String orgNature) {
		this.orgNature = orgNature;
	}

	@Column(name = "ORG_CATEGORY", length = 100)
	public String getOrgCategory() {
		return orgCategory;
	}

	public void setOrgCategory(String orgCategory) {
		this.orgCategory = orgCategory;
	}

	@Column(name = "ORG_STATUS", length = 100)
	public String getOrgStatus() {
		return orgStatus;
	}

	public void setOrgStatus(String orgStatus) {
		this.orgStatus = orgStatus;
	}

	@Column(name = "ORG_LEGAL", length = 100)
	public String getOrgLegal() {
		return orgLegal;
	}

	public void setOrgLegal(String orgLegal) {
		this.orgLegal = orgLegal;
	}

	@Column(name = "ORG_CERTI_NO", length = 100)
	public String getOrgCertiNo() {
		return orgCertiNo;
	}

	public void setOrgCertiNo(String orgCertiNo) {
		this.orgCertiNo = orgCertiNo;
	}

	@Column(name = "ORG_REG_ADDR", length = 1000)
	public String getOrgRegAddr() {
		return orgRegAddr;
	}

	public void setOrgRegAddr(String orgRegAddr) {
		this.orgRegAddr = orgRegAddr;
	}

	@Column(name = "ORG_ICA_REG_NO", length = 100)
	public String getOrgIcaRegNo() {
		return orgIcaRegNo;
	}

	public void setOrgIcaRegNo(String orgIcaRegNo) {
		this.orgIcaRegNo = orgIcaRegNo;
	}

	@Column(name = "ORG_TAX_REG_NO", length = 100)
	public String getOrgTaxRegNo() {
		return orgTaxRegNo;
	}

	public void setOrgTaxRegNo(String orgTaxRegNo) {
		this.orgTaxRegNo = orgTaxRegNo;
	}

	@Column(name = "FAX", length = 100)
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
}