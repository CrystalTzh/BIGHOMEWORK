package vo;

import java.io.Serializable;
import java.util.ArrayList;

import state.FormState;

public class ReceiptFormVO implements  Serializable{
	String date;
	double money;
	String expressname;
	ArrayList<Long> id;
	long NO;
	FormState formstate;//单据的状态
	
	public ReceiptFormVO(String d,double m,String e,ArrayList<Long> i,long NO, FormState formstate){
		date = d;
		money = m;
		expressname = e;
		id = i;
		this.NO = NO; 
		this.formstate = formstate;
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
	
	public long getNO(){
		return NO;
	}

	public FormState getFormstate() {
		return formstate;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void setExpressname(String expressname) {
		this.expressname = expressname;
	}

	public void setId(ArrayList<Long> id) {
		this.id = id;
	}

	public void setNO(long nO) {
		NO = nO;
	}

	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	}
	
}
