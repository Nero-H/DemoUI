package businesslogicservice.examingblservice;

import java.util.ArrayList;

import vo.ReceiptVO;


public interface Examingblservice {

	public boolean pass(String id) ;
	
	public boolean notPass(String id);
	
	public boolean modify(ReceiptVO vo);
	
	
	public ArrayList<ReceiptVO> getReceipts();
}
