package po;

import java.io.Serializable;

public class StoreArrivalFormPO implements Serializable {

	long NO; //��ת���ĵ��ﵥ���
	String relayNumber; //��ת���ı��
	String arriveDate; // ����ʱ��
	String relayFormNumber; //��ת�����
	String startingPoint; //������
	State state; //���ﵽ��״̬
	
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
