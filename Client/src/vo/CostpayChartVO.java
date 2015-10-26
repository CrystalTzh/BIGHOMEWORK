package vo;

import java.io.Serializable;

import state.FormState;

public class CostpayChartVO implements Serializable{
	double income;
	double cost;
	double profit;
	String NO;
	FormState formstate;//单据的状态
	
	public CostpayChartVO() {}
	
	public CostpayChartVO(double i,double c,double p,String N, FormState formstate){
		income = i;
		cost = c;
		profit = p;
		NO = N;
		this.formstate = formstate;
	}

	public double getIncome() {
		return income;
	}

	public double getCost() {
		return cost;
	}

	public double getProfit() {
		return profit;
	}
	
	public String getNO(){
		return NO;
	}

	public FormState getFormstate() {
		return formstate;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public void setNO(String nO) {
		NO = nO;
	}

	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	}
	
}
