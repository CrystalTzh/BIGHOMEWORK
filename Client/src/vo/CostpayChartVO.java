package vo;

import java.io.Serializable;

public class CostpayChartVO implements Serializable{
	double income;
	double cost;
	double profit;
	String NO;
	
	public CostpayChartVO(double i,double c,double p,String N){
		income = i;
		cost = c;
		profit = p;
		NO = N;
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
}
