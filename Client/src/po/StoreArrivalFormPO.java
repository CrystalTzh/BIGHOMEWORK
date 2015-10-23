package po;

import java.io.Serializable;

public class StoreArrivalFormPO implements Serializable {

	long NO; //中转中心到达单编号
	String relayNumber; //中转中心编号
	String arriveDate; // 到达时间
	String relayFormNumber; //中转单编号
	String startingPoint; //出发地
	State state; //货物到达状态
	
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
