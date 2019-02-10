package com.biz.score.vo;

public class ScoreVO {

	private String strId1;
	private String strName;
	private String strPhone;
	private String address;
	
	private String strId2;
	private int intKor;
	private int intEng;
	private int intMath;
	
	private int intTotal;
	private float floatAvg;
	public String getStrId1() {
		return strId1;
	}
	public void setStrId1(String strId1) {
		this.strId1 = strId1;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrPhone() {
		return strPhone;
	}
	public void setStrPhone(String strPhone) {
		this.strPhone = strPhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStrId2() {
		return strId2;
	}
	public void setStrId2(String strId2) {
		this.strId2 = strId2;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	@Override
	public String toString() {
		return "ScoreVO [strId1=" + strId1 + ", strName=" + strName + ", strPhone=" + strPhone + ", address=" + address
				+ ", strId2=" + strId2 + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intTotal=" + intTotal + ", floatAvg=" + floatAvg + "]";
	}
	
	
	
	
}
