package vo;

import java.io.Serializable;

import state.ExpressType;
import state.FormState;

public class OrderFormVO implements Serializable {
	
	//每个VO都需要属性：编辑状态、草稿状态、提交状态
	String sendername;
	String senderaddress;
	String sendercompany;
	String sendertel;
	String sendermobiletel;
	String receivername;
	String receiveraddress;
	String receivercompany;
	String receivertel;
	String receivermobiletel;
	int number;		//原件数
	double weight;  //实际重量
	double size;    //体积
	String name;    //内件品名
	ExpressType type;    //快递种类
	double packingCharges;//包装费
	double transCharges;//运费
	double expressCharges;//快递费
	long ID; //快递订单号
	String date; //寄件日期
	String realReceiver; //实际收件人
	String realReceiveDate;//实际收件日期
	FormState formstate;//单据的状态
	
	public OrderFormVO (String sendername, 
			String senderaddress, String sendercompany, 
			String sendertel, String sendermobiletel, 
			String receivername, String receiveraddress,
			String receivercompany, String receivertel,
			String receivermobiletel, int number,
			double weight, double size, String name,
			ExpressType type, double packingCharges,
			double transCharges, double expressCharges,
			long ID, String date, String realReceiver, 
			String realReceiveDate, FormState formstate) {
		this.sendername = sendername;
		this.senderaddress = senderaddress;
		this.sendercompany = sendercompany;
		this.sendertel = sendertel;
		this.sendermobiletel = sendermobiletel;
		this.receivermobiletel = receivermobiletel;
		this.receivername = receivername;
		this.receiveraddress = receiveraddress;
		this.receivercompany = receivercompany;
		this.receivertel = receivertel;
		this.receivermobiletel = receivermobiletel;
		this.number = number;
		this.weight = weight;
		this.size = size;
		this.name = name;
		this.type = type;
		this.packingCharges = packingCharges;
		this.transCharges = transCharges;
		this.expressCharges = expressCharges;
		this.ID = ID;
		this.date = date;
		this.realReceiver = realReceiver;
		this.realReceiveDate = realReceiveDate;
		this.formstate = formstate;
	}
	
	public String getSendername() {
		return sendername;
	}
	public String getSenderaddress() {
		return senderaddress;
	}
	public String getSendercompany() {
		return sendercompany;
	}
	public String getSendertel() {
		return sendertel;
	}
	public String getSendermobiletel() {
		return sendermobiletel;
	}
	public String getReceivername() {
		return receivername;
	}
	public String getReceiveraddress() {
		return receiveraddress;
	}
	public String getReceivercompany() {
		return receivercompany;
	}
	public String getReceivertel() {
		return receivertel;
	}
	public String getReceivermobiletel() {
		return receivermobiletel;
	}
	public int getNumber() {
		return number;
	}
	public double getWeight() {
		return weight;
	}
	public double getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
	public ExpressType getType() {
		return type;
	}
	public double getPackingCharges() {
		return packingCharges;
	}
	public double getTransCharges() {
		return transCharges;
	}
	public double getExpressCharges() {
		return expressCharges;
	}
	public long getID() {
		return ID;
	}
	public String getDate() {
		return date;
	}
	public String getRealReceiver() {
		return realReceiver;
	}
	public String getRealReceiveDate() {
		return realReceiveDate;
	}
	public void setSendername(String sendername) {
		this.sendername = sendername;
	}
	public void setSenderaddress(String senderaddress) {
		this.senderaddress = senderaddress;
	}
	public void setSendercompany(String sendercompany) {
		this.sendercompany = sendercompany;
	}
	public void setSendertel(String sendertel) {
		this.sendertel = sendertel;
	}
	public void setSendermobiletel(String sendermobiletel) {
		this.sendermobiletel = sendermobiletel;
	}
	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}
	public void setReceiveraddress(String receiveraddress) {
		this.receiveraddress = receiveraddress;
	}
	public void setReceivercompany(String receivercompany) {
		this.receivercompany = receivercompany;
	}
	public void setReceivertel(String receivertel) {
		this.receivertel = receivertel;
	}
	public void setReceivermobiletel(String receivermobiletel) {
		this.receivermobiletel = receivermobiletel;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(ExpressType type) {
		this.type = type;
	}
	public void setPackingCharges(double packingCharges) {
		this.packingCharges = packingCharges;
	}
	public void setTransCharges(double transCharges) {
		this.transCharges = transCharges;
	}
	public void setExpressCharges(double expressCharges) {
		this.expressCharges = expressCharges;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setRealReceiver(String realReceiver) {
		this.realReceiver = realReceiver;
	}
	public void setRealReceiveDate(String realReceiveDate) {
		this.realReceiveDate = realReceiveDate;
	}

	public FormState getFormstate() {
		return formstate;
	}

	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	} 
	
}
