package businesslogicservice.importblservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.ClientVO;
import vo.GoodsVO;
import vo.ImportInfoVO;
import vo.ImportVO;
import businesslogic.importbl.ImportBLService_Stub;

public class ImportBLService_Driver {
	public void drive(ImportBLService importBLService) throws RemoteException{
		ArrayList<ClientVO> clientVOs = importBLService.showClientList();
		if(clientVOs != null)
			System.out.println("Show clientList successfully!");
		
		ArrayList<GoodsVO> goodsVOs = importBLService.showGoodsList();
		if(goodsVOs != null)
			System.out.println("Show goodsList successfully!");
		
		boolean resultOfAddClient = importBLService.addClient(new ClientVO());
		if(resultOfAddClient)
			System.out.println("Add client successfully!");
		
		boolean resultOfAddGoods = importBLService.addGoods("", 1, 1, "test");
		if(resultOfAddGoods)
			System.out.println("Add goods successfully!");
		
		boolean resultOfAddOtherInfo = importBLService.addOtherInfo(new ImportInfoVO());
		if(resultOfAddOtherInfo)
			System.out.println("Add other import infomation successfully!");
		
		ArrayList<ImportVO> importVOs = importBLService.showImport();
		if(importVOs != null)
			System.out.println("Show import list successfully!");
		
		boolean resultOfImportReturn = importBLService.importReturn(0);
		if(resultOfImportReturn)
			System.out.println("Import return successfully!");
		
		double total = importBLService.getTotal();
		if(total == 0)
			System.out.println("Get total success!"+ " The total is " + total);
		
		boolean resultOfCreateImport = importBLService.creatImport();
		if (resultOfCreateImport)
			System.out.println("Creat import successfully!");
		
	}
	
	public static void main(String[] args) throws RemoteException {
		ImportBLService importController = new ImportBLService_Stub();
		new ImportBLService_Driver().drive(importController);
	}
}
