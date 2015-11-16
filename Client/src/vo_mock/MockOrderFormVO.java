package vo_mock;

import state.ExpressType;
import state.FormState;
import state.Transportation;
import vo.OrderFormVO;

public class MockOrderFormVO extends OrderFormVO{
	String sendername = "";
	String senderaddress = "";
	String sendercompany = "";
	String sendertel= "";
	String sendermobiletel= "";
	String receivername= "";
	String receiveraddress= "";
	String receivercompany= "";
	String receivertel= "";
	String receivermobiletel= "";
	int number = 0;		//原件数
	double weight = 0;  //实际重量
	double size = 0;    //体积
	String name = "";    //内件品名
	ExpressType type = null;    //快递种类
	double packingCharges = 0;//包装费
	double transCharges = 0;//运费
	double expressCharges = 0;//快递费
	long ID = 0; //快递订单号
	String date= ""; //寄件日期
	String realReceiver= ""; //实际收件人
	String realReceiveDate= "";//实际收件日期
	Transportation transportation = null;//货运状态
	FormState formstate;//单据的状态
	public MockOrderFormVO(long ID)
	{
		this.ID = ID;
		sendername = "谭琼";
		senderaddress = "南京栖霞";
		sendercompany = "南京大学";
		sendertel = "025-88888888";
		sendermobiletel = "135****8653";
		receivername = "涂登熬";
		receiveraddress = "北京朝阳";
		receivercompany = "清华大学";
		receivertel = "010-66666666";
		receivermobiletel = "185****3697";
		number = 2;
		weight = 2.5;
		size = 1.0;
		name = "花和书";
		type = ExpressType.STANDARD;
		packingCharges = 10.0;
		transCharges = 27.0;
		expressCharges = 37.0;
		date = "2015-11-16";
		realReceiver = null;
		realReceiveDate = null;
		transportation = Transportation.COLLECTED;
		formstate = FormState.DRAFT;
	}
	public String getReceivername()
	{
		return receivername;
	}
}
