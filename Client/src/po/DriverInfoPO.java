package po;

import java.io.Serializable;

public class DriverInfoPO implements Serializable{
	
	public enum sexlist{
		MAN,WoMAN
	}
	
	long driver;
	String name;
	String birthday;
	String idcard;
	long cellphone;
	String licensedate;
	sexlist sex;
	
	public DriverInfoPO(long d, String n,String b,String i,long c,String l,sexlist s){
		driver = d;
		name = n;
		birthday = b;
		idcard = i;
		cellphone = c;
		licensedate = l;
		sex = s;
	}

	public long getDriver() {
		return driver;
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

	public sexlist getSex() {
		return sex;
	}
}
