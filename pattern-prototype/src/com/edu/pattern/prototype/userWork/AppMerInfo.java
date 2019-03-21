package com.edu.pattern.prototype.userWork;

import java.lang.reflect.Field;




/**
 * 
 * 商户注册
 * @author sun
 *
 */
public class AppMerInfo {

	@FieldTypeAnnotation(necessary="Y",message="商户名称不可空")
	private String mercCnm;
	
	@FieldTypeAnnotation(necessary="Y",message="注册地址不可空")
	private String regAddr;//注册地址不可空
	
	@FieldTypeAnnotation(necessary="Y",message="法人代表姓名不可空")
	private String crpNm;//法人代表姓名不可空
	
	@FieldTypeAnnotation(necessary="Y",message="法人代表证件号码不可空")
	private String crpIdNo;//法人代表证件号码不可空
	
	@FieldTypeAnnotation(necessary="N",message="法人代表证件地址")
	private String crpAddress;//法人代表证件地址
	
	@FieldTypeAnnotation(necessary="N",message="身份证正面图片不可空")
	private String crpAboveImg;//身份证正面图片不可空
	
	@FieldTypeAnnotation(necessary="N",message="身份证反面图片不可空")
	private String crpBelowImg;//身份证反面图片不可空
	
	@FieldTypeAnnotation(necessary="N",message="手持身份证正面图片不可空")
	private String handheldAboveImg;//手持身份证正面图片不可空
	
	@FieldTypeAnnotation(necessary="N",message="企业类型营业执照图片不可空")
	private String bussinesImg;//企业类型营业执照图片不可空
	
	@FieldTypeAnnotation(necessary="Y",message="省编码不可空")
	private String mercProv;//省编码不可空
	
	@FieldTypeAnnotation(necessary="Y",message="市编码不可空")
	private String mercCity;//市编码不可空
	
	@FieldTypeAnnotation(necessary="Y",message="区/县编码不可空")
	private String mercArea;//区/县编码不可空
	
	@FieldTypeAnnotation(necessary="N",message="商户联系人手机不可空")
	private String contactsTel;//商户联系人手机不可空
	
	@FieldTypeAnnotation(necessary="Y",message="账户不可空")
	private String accountNo;//账户不可空
	
	@FieldTypeAnnotation(necessary="Y",message="户名不可空")
	private String accountName;//户名不可空
	
	@FieldTypeAnnotation(necessary="Y",message="开户行名称不可空")
	private String bankName;//开户行名称不可空
	
	@FieldTypeAnnotation(necessary="Y",message="开户行行别不可空")
	private String banktype;//开户行行别不可空
	
	@FieldTypeAnnotation(necessary="Y",message="开户行联行行号不可空")
	private String bankcode;//开户行联行行号不可空
	
	@FieldTypeAnnotation(necessary="Y",message="开户行行省不可空")
	private String bankProvince;//开户行行省不可空
	
	@FieldTypeAnnotation(necessary="Y",message="开户行城市不可空")
	private String bankCity;//开户行城市不可空
	
	public Verify verify(){
		Verify verify = new Verify();
		verify.setSuccess(true);
		verify.setMessage("验证通过");
		Class<AppMerInfo> cls = (Class<AppMerInfo>) this.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			boolean fieldHasAnno = field.isAnnotationPresent(FieldTypeAnnotation.class);
			if (fieldHasAnno) {
				FieldTypeAnnotation fieldAnno = field.getAnnotation(FieldTypeAnnotation.class);
				// 输出注解属性
				if ("y".equalsIgnoreCase(fieldAnno.necessary())) { // 必填写
					field.setAccessible(true);
					try {
						if (field.get(this) == null || "".equals((field.get(this)+"").trim())) {
							verify.setSuccess(false);
							verify.setMessage(fieldAnno.message());
							return verify;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return verify;
	}
	
	public String getMercCnm() {
		return mercCnm;
	}
	public void setMercCnm(String mercCnm) {
		this.mercCnm = mercCnm;
	}
	public String getRegAddr() {
		return regAddr;
	}
	public void setRegAddr(String regAddr) {
		this.regAddr = regAddr;
	}
	public String getCrpNm() {
		return crpNm;
	}
	public void setCrpNm(String crpNm) {
		this.crpNm = crpNm;
	}
	public String getCrpIdNo() {
		return crpIdNo;
	}
	public void setCrpIdNo(String crpIdNo) {
		this.crpIdNo = crpIdNo;
	}
	public String getCrpAddress() {
		return crpAddress;
	}
	public void setCrpAddress(String crpAddress) {
		this.crpAddress = crpAddress;
	}
	public String getCrpAboveImg() {
		return crpAboveImg;
	}
	public void setCrpAboveImg(String crpAboveImg) {
		this.crpAboveImg = crpAboveImg;
	}
	public String getCrpBelowImg() {
		return crpBelowImg;
	}
	public void setCrpBelowImg(String crpBelowImg) {
		this.crpBelowImg = crpBelowImg;
	}
	public String getHandheldAboveImg() {
		return handheldAboveImg;
	}
	public void setHandheldAboveImg(String handheldAboveImg) {
		this.handheldAboveImg = handheldAboveImg;
	}
	public String getBussinesImg() {
		return bussinesImg;
	}
	public void setBussinesImg(String bussinesImg) {
		this.bussinesImg = bussinesImg;
	}
	public String getMercProv() {
		return mercProv;
	}
	public void setMercProv(String mercProv) {
		this.mercProv = mercProv;
	}
	public String getMercCity() {
		return mercCity;
	}
	public void setMercCity(String mercCity) {
		this.mercCity = mercCity;
	}
	public String getMercArea() {
		return mercArea;
	}
	public void setMercArea(String mercArea) {
		this.mercArea = mercArea;
	}
	public String getContactsTel() {
		return contactsTel;
	}
	public void setContactsTel(String contactsTel) {
		this.contactsTel = contactsTel;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBanktype() {
		return banktype;
	}
	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}
	public String getBankcode() {
		return bankcode;
	}
	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}
	public String getBankProvince() {
		return bankProvince;
	}
	public void setBankProvince(String bankProvince) {
		this.bankProvince = bankProvince;
	}
	public String getBankCity() {
		return bankCity;
	}
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}
}
