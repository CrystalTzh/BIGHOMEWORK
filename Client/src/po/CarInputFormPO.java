package po;

import java.io.Serializable;
import java.util.ArrayList;

public class CarInputFormPO implements Serializable {
	long NO; //װ�������
	String destination; //�����
	String motorNumber; //����ת�������˱��
	String carNumber; //��������
	String loadingMember; //��װԱ
	String supercargo; //Ѻ��Ա
	String putOnCarDate; //װ������
	ArrayList<Long> allIDs; //���ж�����
	double transCharge; //�˷�
	
	public String getDestination() {
		return destination;
	}
	public String getMotorNumber() {
		return motorNumber;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public String getLoadingMember() {
		return loadingMember;
	}
	public String getSupercargo() {
		return supercargo;
	}
	public String getPutOnCarDate() {
		return putOnCarDate;
	}
	public ArrayList<Long> getAllIDs() {
		return allIDs;
	}
	public double getTransCharge() {
		return transCharge;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setMotorNumber(String motorNumber) {
		this.motorNumber = motorNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public void setLoadingMember(String loadingMember) {
		this.loadingMember = loadingMember;
	}
	public void setSupercargo(String supercargo) {
		this.supercargo = supercargo;
	}
	public void setPutOnCarDate(String putOnCarDate) {
		this.putOnCarDate = putOnCarDate;
	}
	public void setAllIDs(ArrayList<Long> allIDs) {
		this.allIDs = allIDs;
	}
	public void setTransCharge(double transCharge) {
		this.transCharge = transCharge;
	}
	public long getNO() {
		return NO;
	}
	public void setNO(long nO) {
		NO = nO;
	}

}
