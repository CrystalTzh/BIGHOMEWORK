package po;

import java.io.Serializable;

public class StorageOutFormPO implements  Serializable{
	String NO;
	String date;
	long expressNumber;
	String destination;
	String position;
	
	public  StorageOutFormPO(String da,long i,String de,String p){
		date=da;
		expressNumber=i;
		destination=de;
		position=p;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public long getExpressNumber() {
		return expressNumber;
	}
	
	public void setExpressNumber(long expressNumber) {
		this.expressNumber = expressNumber;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position=position;
	}
}
//可以考虑一个叫show的方法
//public String show(long ID){
//	return information;
//}