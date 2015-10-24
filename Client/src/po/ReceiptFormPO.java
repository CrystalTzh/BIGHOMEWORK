package po;

import java.io.Serializable;
import java.util.ArrayList;

public class ReceiptFormPO implements  Serializable{
	String date;
	double money;
	String expressname;
	ArrayList<Long> id;
	String NO;
	
	public ReceiptFormPO(String d,double m,String e,ArrayList<Long> i,String N){
		date = d;
		money = m;
		expressname = e;
		id = i;
		NO = N; 
	}

	public String getDate() {
		return date;
	}

	public double getMoney() {
		return money;
	}

	public String getExpressname() {
		return expressname;
	}

	public ArrayList<Long> getId() {
		return id;
	}
	
	public String getNO(){
		return NO;
	}
}
