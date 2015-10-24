package vo;

import java.io.Serializable;

public class StorageOutFormVO implements  Serializable{
	String NO;
	String date;
	long expressNumber;
	String destination;
	String position;
	
	public  StorageOutFormVO(String da,long i,String de,String p){
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
//���Կ���һ����show�ķ���
//public String show(long ID){
//	return information;
//}