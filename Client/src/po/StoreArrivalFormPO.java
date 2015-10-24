package po;

import java.io.Serializable;

import state.State;

public class StoreArrivalFormPO implements Serializable {

	long NO; //营业厅到达单编号
	String relayNumber; //中转中心编号
<<<<<<< HEAD
	String arriveDate; // 到达日期
	String relayFormNumber; //中转单编号
	String startingPoint; //出发地
	State state; //货物到达状态
=======
	String arriveDate; //到达日期
	String relayFormNumber; //中转单编号
	String startingPoint; //出发地
	State state;//货物到达状态
>>>>>>> origin/master
	
	public String getRelayNumber() {
		return relayNumber;
	}
	public String getArriveDate() {
		return arriveDate;
	}
	public String getRelayFormNumber() {
		return relayFormNumber;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public State getState() {
		return state;
	}
	public void setRelayNumber(String relayNumber) {
		this.relayNumber = relayNumber;
	}
	public void setArriveDate(String arriveDate) {
		this.arriveDate = arriveDate;
	}
	public void setRelayFormNumber(String relayFormNumber) {
		this.relayFormNumber = relayFormNumber;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public void setState(State state) {
		this.state = state;
	}
	
}
