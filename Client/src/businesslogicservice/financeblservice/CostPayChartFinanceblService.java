package businesslogicservice.financeblservice;

import po.PaymentFormPO;
import po.ReceiptFormPO;
import vo.CostpayChartVO;

public interface CostPayChartFinanceblService {

	public CostpayChartVO costPayChartCreat();
	public boolean costPayChartCreat(CostpayChartVO vo);
	public CostpayChartVO costPayChartCreat(long NO);
	public boolean costPayChartAddInfo (ReceiptFormPO rpo,PaymentFormPO ppo);
	
}
