package businesslogic.stub.financeblStub;

import java.util.ArrayList;

import vo.ReceiptFormVO;
import vo.ReceiptGatherVO;
import businesslogicservice.financeblservice.ReceiptGatherFinanceblService;

public class ReceiptGatherFinanceblStub implements
		ReceiptGatherFinanceblService {

	@Override
	public ReceiptGatherVO ReceiptGathercreate() {
		// TODO Auto-generated method stub
		System.out.println("call ReceiptGathercreate...");
		return null;
	}

	@Override
	public void ReceiptGathercancel(ReceiptFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call ReceiptGathercancel...");
	}

	@Override
	public boolean ReceiptGathersave(ReceiptGatherVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call ReceiptGathersave...");
		return false;
	}

	@Override
	public boolean ReceiptGathersubmit(ReceiptGatherVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call ReceiptGathersubmit...");
		return false;
	}

	@Override
	public boolean ReceiptGatherwithdraw(ReceiptGatherVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call ReceiptGatherwithdraw...");
		return false;
	}

	@Override
	public boolean receiptGatherAddInfo(
			ArrayList<ReceiptFormVO> receiptFormgathervo) {
		// TODO Auto-generated method stub
		System.out.println("call receiptGatherAddInfo...");
		return false;
	}

}
