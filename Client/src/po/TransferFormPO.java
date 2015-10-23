package po;

import java.io.*;
import java.util.ArrayList;

import state.Transport;

public class TransferFormPO implements Serializable {
	
	String putOnCarDate; //装车日期
	long NO;//本中转中心中转单编号
	String startingpoint; //出发地
	String destination; //到达地
	String loadingMember; //监装员
	Transport transport; //运输方式
	String zone;
	int line;
	int shelf;
	int tag; //（货柜号）区号排号架号位号
	ArrayList<Long> allIDs; //所有订单号
	double transCharge; //运费
	
	public String getPutOnCarDate() {
		return putOnCarDate;
	}
	public String getStartingpoint() {
		return startingpoint;
	}
	public String getDestination() {
		return destination;
	}
	public String getLoadingMember() {
		return loadingMember;
	}
	public String getZone() {
		return zone;
	}
	public int getLine() {
		return line;
	}
	public int getShelf() {
		return shelf;
	}
	public int getTag() {
		return tag;
	}
	public ArrayList<Long> getAllIDs() {
		return allIDs;
	}
	public double getTransCharge() {
		return transCharge;
	}
	public void setPutOnCarDate(String putOnCarDate) {
		this.putOnCarDate = putOnCarDate;
	}
	public void setStartingpoint(String startingpoint) {
		this.startingpoint = startingpoint;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setLoadingMember(String loadingMember) {
		this.loadingMember = loadingMember;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	public void setTag(int tag) {
		this.tag = tag;
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
