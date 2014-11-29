package businesslogicservice.financialblservice.driver;

import java.util.ArrayList;

import vo.AccountVO;
import vo.PayVO;
import vo.PayVOLineItem;
import vo.ReceiptType;
import vo.ReceiveVO;
import vo.ReceiveVOLineItem;
import businesslogic.financialbl.stub.MoneyManagerStub;
import businesslogicservice.financialblservice.MoneyBLService;

public class MoneyBLService_Driver {
	
	public void drive(MoneyBLService moneyBLService){
		AccountVO account = new AccountVO("Nero",2312);
		PayVOLineItem item = new PayVOLineItem(account,43565,"daos");
		ArrayList<PayVOLineItem> itemList = new ArrayList<PayVOLineItem>();
		itemList.add(item);
		boolean result = false;
		result = moneyBLService.finish(ReceiptType.Pay);
		if(result){
			System.out.println("pay pass");
		}else{
			System.out.println("pay failed");
		}
		ReceiveVOLineItem RItem = new ReceiveVOLineItem(account, 43565, "daos");
		ArrayList<ReceiveVOLineItem> RitemList = new ArrayList<ReceiveVOLineItem>();
		RitemList.add(RItem);
		result = moneyBLService.finish(ReceiptType.Receive);
		if(result){
			System.out.println("receive pass");
		}else{
			System.out.println("receive failed");
		}
	}
	
	public static void main(String[] args) {
		MoneyBLService moneyBLService = new MoneyManagerStub();
		MoneyBLService_Driver driver = new MoneyBLService_Driver();
		driver.drive(moneyBLService);
	}
}
