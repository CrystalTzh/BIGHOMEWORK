package po;

import java.io.Serializable;

import state.SexList;

public class DriverInfoPO implements Serializable{
	
	long driverNumber;
	String name;
	String birthday;
	String idcard;
	long cellphone;
	String licensedate;
	SexList sex;
	
	public DriverInfoPO(long d, String n,String b,String i,long c,String l,SexList s){
		driverNumber = d;
		name = n;
		birthday = b;
		idcard = i;
		cellphone = c;
		licensedate = l;
		sex = s;
	}

	public void setDriverNumber(long driverNumber) {
		this.driverNumber = driverNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public void setCellphone(long cellphone) {
		this.cellphone = cellphone;
	}

	public void setLicensedate(String licensedate) {
		this.licensedate = licensedate;
	}

	public void setSex(SexList sex) {
		this.sex = sex;
	}

	public long getDriverNumber() {
		return driverNumber;
	}

	public String getName() {
		return name;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getIdcard() {
		return idcard;
	}

	public long getCellphone() {
		return cellphone;
	}

	public String getLicensedate() {
		return licensedate;
	}

	public SexList getSex() {
		return sex;
	}
}
