package vo;

import java.io.Serializable;

import state.FormState;

public class PaymentFormVO implements Serializable{
	String date;
	double money;
	String name;
	long account;
	double rent;
	int year;
	double freight;
	long id;
	double salary;
	double bonus;
	int month;
	String NO;
	FormState formstate;//单据的状态
	
	public PaymentFormVO(String d,double m,String n,long a,String N, FormState formstate){
		date = d;
		money = m;
		name = n;
		account = a;
		NO = N;
		this.formstate = formstate;
	}

	public String getDate() {
		return date;
	}

	public double getMoney() {
		return money;
	}

	public String getName() {
		return name;
	}

	public long getAccount() {
		return account;
	}
	
	public String getNO(){
		return NO;
	}

	public double getRent() {
		return rent;
	}

	public int getYear() {
		return year;
	}

	public double getFreight() {
		return freight;
	}

	public long getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public int getMonth() {
		return month;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setNO(String nO) {
		NO = nO;
	}

	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	}
	
}
