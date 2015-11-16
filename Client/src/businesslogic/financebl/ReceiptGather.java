package businesslogic.financebl;

import java.util.ArrayList;

import businesslogicservice.financeblservice.ReceiptGatherFinanceblService;
import vo.ReceiptFormVO;
import vo.ReceiptGatherVO;

public class ReceiptGather implements ReceiptGatherFinanceblService{

	@Override
	public ReceiptGatherVO ReceiptGathercreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ReceiptGathercancel(ReceiptFormVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ReceiptGathersave(ReceiptGatherVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ReceiptGathersubmit(ReceiptGatherVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ReceiptGatherwithdraw(ReceiptGatherVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ReceiptGatherAddInfo(ArrayList<ReceiptFormVO> receiptFormgathervo) {
		// TODO Auto-generated method stub
		return false;
	}

}
