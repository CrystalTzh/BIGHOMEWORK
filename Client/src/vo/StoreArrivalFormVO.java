package vo;

import java.io.Serializable;

import state.FormState;
import state.State;

public class StoreArrivalFormVO implements Serializable {

	long NO; //营业厅到达单编号
	String relaynumber; //中转中心编号
	String arriveDate; // 到达日期
	long relayformnumber; //中转单编号
	String startingPoint; //出发地
	State state; //货物到达状态
	FormState formstate;//单据的状态
	
	public StoreArrivalFormVO () {}
	
	public StoreArrivalFormVO(long NO, long relayformnumber, String arriveDate, String relaynumber, State state, String startingPoint, FormState formstate) {
		super();
		// TODO Auto-generated constructor stub
		this.NO = NO;
		this.relayformnumber = relayformnumber;
		this.arriveDate = arriveDate;
		this.relaynumber = relaynumber;
		this.startingPoint = startingPoint;
		this.state = state;
		this.formstate = formstate;
	}
	
	public String getRelayNumber() {
		return relaynumber;
	}
	public String getArriveDate() {
		return arriveDate;
	}
	public long getRelayFormNumber() {
		return relayformnumber;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public State getState() {
		return state;
	}
	public void setRelayNumber(String relaynumber) {
		this.relaynumber = relaynumber;
	}
	public void setArriveDate(String arriveDate) {
		this.arriveDate = arriveDate;
	}
	public void setRelayFormNumber(long relayformNumber) {
		this.relayformnumber = relayformnumber;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public void setState(State state) {
		this.state = state;
	}
	public long getNO() {
		return NO;
	}
	public String getRelaynumber() {
		return relaynumber;
	}
	public long getRelayformnumber() {
		return relayformnumber;
	}
	public FormState getFormstate() {
		return formstate;
	}
	public void setNO(long nO) {
		NO = nO;
	}
	public void setRelaynumber(String relaynumber) {
		this.relaynumber = relaynumber;
	}
	public void setRelayformnumber(long relayformnumber) {
		this.relayformnumber = relayformnumber;
	}
	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	}
	
	
}
