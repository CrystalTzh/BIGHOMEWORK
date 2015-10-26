package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.TransferFormblService;
import vo.TransferFormVO;

public class TransferFormTransitblStub implements TransferFormblService{

	@Override
	public TransferFormVO TransferFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void TransferFormcancel(TransferFormVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean TransferFormsave(TransferFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean TransferFormsubmit(TransferFormVO vo) {
		// TODO print "Submit TransferForm successfully!"
		return true;
	}

	@Override
	public boolean TransferFormwithdraw(TransferFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
