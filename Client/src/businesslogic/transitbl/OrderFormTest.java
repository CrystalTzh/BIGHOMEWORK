package businesslogic.transitbl;

import static org.junit.Assert.*;

import org.junit.Test;
import vo_mock.MockOrderFormVO;

public class OrderFormTest {

	@Test
	public void testSaveOrderForm() {
		MockOrderFormVO orderFormVO = new MockOrderFormVO(2501000);
		OrderForm orderForm = new OrderForm();
		boolean isSaved = orderForm.OrderFormsave(orderFormVO);
		assertEquals(true, isSaved);
	}
}
