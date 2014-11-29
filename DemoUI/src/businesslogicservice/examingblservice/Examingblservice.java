package businesslogicservice.examingblservice;

import vo.ReceiptVO;


public interface Examingblservice {

	public boolean pass() ;
	
	public boolean notPass();
	
	public boolean modify(ReceiptVO vo);
}
