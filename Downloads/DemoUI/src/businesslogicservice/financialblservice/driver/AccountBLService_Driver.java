package businesslogicservice.financialblservice.driver;

import java.rmi.RemoteException;

import vo.AccountVO;
import vo.UpdateAccountVO;
import businesslogic.financialbl.stub.AccountManagerStub;
import businesslogicservice.financialblservice.AccountBLService;

public class AccountBLService_Driver {
	public void drive(AccountBLService accountBLService){
		AccountVO vo = new AccountVO("Nero",983);
		boolean result = false;
		try {
			result = accountBLService.addAccount(vo);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result){
			System.out.println("add account pass");
		}else{
			System.out.println("add failed");
		}
		
		try {
			result = accountBLService.delAccount("X930");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result){
			System.out.println("delete account pass");
		}else{
			System.out.println("delete account failed");
		}
		
		try {
			UpdateAccountVO uao = new UpdateAccountVO("Nero", "H");
			result = accountBLService.updateAccount(uao);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result){
			System.out.println("update account pass");
		}else{
			System.out.println("update account failed");
		}
		
		try {
			vo = accountBLService.findAccount("X930");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(vo != null){
			System.out.println("find account pass");
		}else{
			System.out.println("find account failed");
		}
	}
	
	public static void main(String args[]){
		AccountBLService accountBLService = new AccountManagerStub("Nero",213,"xs2");
		AccountBLService_Driver driver = new AccountBLService_Driver();
		driver.drive(accountBLService);
	}
}
