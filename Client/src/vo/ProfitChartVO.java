package vo;

import java.io.Serializable;
import java.util.ArrayList;

public class ProfitChartVO implements Serializable {

	ArrayList<PaymentFormVO> paymentformvo;
	ArrayList<ReceiptFormVO> receiptformvo;
	long NO;
	
	public ProfitChartVO(ArrayList<PaymentFormVO> paymentformvo, 
			ArrayList<ReceiptFormVO> receiptformvo, long NO) {
		super();
		// TODO Auto-generated constructor stub
		this.paymentformvo = paymentformvo;
		this.receiptformvo = receiptformvo;
		this.NO = NO;
	}

	public ArrayList<PaymentFormVO> getPaymentformvo() {
		return paymentformvo;
	}

	public ArrayList<ReceiptFormVO> getReceiptformvo() {
		return receiptformvo;
	}

	public void setPaymentformpo(ArrayList<PaymentFormVO> paymentformvo) {
		this.paymentformvo = paymentformvo;
	}

	public void setReceiptformpo(ArrayList<ReceiptFormVO> receiptformvo) {
		this.receiptformvo = receiptformvo;
	}

	public long getNO() {
		return NO;
	}

	public void setNO(long nO) {
		NO = nO;
	}	
	
	
}
