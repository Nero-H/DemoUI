package businesslogicservice.financialblservice.driver;

import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.CashRecordLineItemVO;
import vo.CashRecordVO;
import businesslogic.financialbl.stub.CashRecordManagerStub;
import businesslogicservice.financialblservice.CashRecordBLService;

public class CashRecordBLService_Driver {
	public void drive(CashRecordBLService cashRecordBLService){
		CashRecordVO vo = new CashRecordVO("accountName", new ArrayList<CashRecordLineItemVO>(), 12354, "serialNumber", "userName");
		double result = 0;
		try {
			result = cashRecordBLService.addItem(new CashRecordLineItemVO("name", 12312,""));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result != 0){
			System.out.println("Make CashRecord pass");
		}else{
			System.out.println("Make CashRecord failed");
		}
	}
	
	public static void main(String args[]){
		CashRecordBLService_Driver driver = new CashRecordBLService_Driver();
		CashRecordBLService cashRecordBLService = new CashRecordManagerStub();
		driver.drive(cashRecordBLService);
	}
}
