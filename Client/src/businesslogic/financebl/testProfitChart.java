package businesslogic.financebl;

import static org.junit.Assert.*;

import org.junit.Test;

import vo.PaymentFormVO;
import vo.ProfitChartVO;
import vo.ReceiptFormVO;

public class testProfitChart {

	@Test
	public void test() {
		ProfitChart profit = new ProfitChart();
		ProfitChartVO profitChartVO = profit.profitChartCheck(12678);
		ReceiptFormVO receiptFormVO = profitChartVO.getReceiptformvo().get(0);
		PaymentFormVO paymentFormVO = profitChartVO.getPaymentformvo().get(0);
		assertEquals("2015-01-01", receiptFormVO.getDate());
//		assertEquals("hello", paymentFormVO.getName());
		assertEquals("2015-12", paymentFormVO.getPayDate());
	}

}
