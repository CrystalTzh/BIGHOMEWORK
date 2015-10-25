package vo;

import java.io.Serializable;

import state.FormState;

public  class ConstVO implements Serializable{
	double distancePrice;//距离价格常量
	double baseSalary;//快递员和营业厅业务员的基本工资
	double receiveExpressPrize;//快递员揽件提成
	double sendExpressPrize;//快递员派件提成
	double salaryEachInCity;//司机市内计次
	double salaryEachOutCity;//司机跨市计次
	FormState formstate;//单据的状态
	
	public ConstVO(){
		distancePrice = 2.0;
		baseSalary = 2000;
		receiveExpressPrize = 1;
		sendExpressPrize = 0.5;
		salaryEachInCity = 50;
		salaryEachOutCity = 200;
		formstate = FormState.EDITABLE;
	}
	public ConstVO(double dp, double bs, double rep, double sep, 
			double sei, double seo, FormState formstate) {
		distancePrice = dp;
		baseSalary	=bs;
		receiveExpressPrize = rep;
		sendExpressPrize = sep;
		salaryEachInCity = sei;
		salaryEachOutCity = seo;
		this.formstate = formstate;
	}

	public double getDistancePrice() {
		return distancePrice;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double getReceiveExpressPrize() {
		return receiveExpressPrize;
	}

	public double getSendExpressPrize() {
		return sendExpressPrize;
	}

	public double getSalaryEachInCity() {
		return salaryEachInCity;
	}

	public double getSalaryEachOutCity() {
		return salaryEachOutCity;
	}

	public void setDistancePrice(double distancePrice) {
		this.distancePrice = distancePrice;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setReceiveExpressPrize(double receiveExpressPrize) {
		this.receiveExpressPrize = receiveExpressPrize;
	}

	public void setSendExpressPrize(double sendExpressPrize) {
		this.sendExpressPrize = sendExpressPrize;
	}

	public void setSalaryEachInCity(double salaryEachInCity) {
		this.salaryEachInCity = salaryEachInCity;
	}

	public void setSalaryEachOutCity(double salaryEachOutCity) {
		this.salaryEachOutCity = salaryEachOutCity;
	}

	public FormState getFormstate() {
		return formstate;
	}

	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	}
	
}
