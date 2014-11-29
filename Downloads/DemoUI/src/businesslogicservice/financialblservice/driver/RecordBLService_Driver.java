package businesslogicservice.financialblservice.driver;

import java.rmi.RemoteException;

import vo.RecordVO;
import businesslogic.financialbl.stub.RecordManagerStub;
import businesslogicservice.financialblservice.RecordBLService;

public class RecordBLService_Driver {
	public void drive(RecordBLService recordBLService){
		RecordVO vo = new RecordVO();
		boolean result = false;
		try {
			result = recordBLService.buildNewRecord(vo);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result){
			System.out.println("build new record pass");
		}else{
			System.out.println("build new record failed");
		}
	}
	
	public static void main(String[] args) {
		RecordBLService_Driver driver = new RecordBLService_Driver();
		RecordBLService recordBLService = new RecordManagerStub();
		driver.drive(recordBLService);
	}
}
