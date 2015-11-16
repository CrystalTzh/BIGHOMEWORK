package businesslogic.financebl;

import static org.junit.Assert.*;

import org.junit.Test;

import vo.CostpayChartVO;

public class testCostPayChart {

	@Test
	public void test() {
		CostPayChart contpay = new CostPayChart();
//		System.out.println(mockCostPayChart.getProfit());
		CostpayChartVO costpayChartVO = contpay.costPayChartCheck(66666666);
		assertEquals(10000, costpayChartVO.getProfit());
	}

}
