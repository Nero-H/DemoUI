package businesslogicservice.saleblservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.ClientVO;
import vo.GoodsVO;
import vo.SalesInfoVO;
import vo.SalesVO;
import businesslogic.salebl.SalesBLService_Stub;

public class SalesBLService_Driver {
	public void drive(SalesBLService salesBLService) throws RemoteException{
		ArrayList<ClientVO> clientVOs = salesBLService.showClientList();
		if(clientVOs != null)
			System.out.println("Show clientList successfully!");
		
		ArrayList<GoodsVO> goodsVOs = salesBLService.showGoodsList();
		if(goodsVOs != null)
			System.out.println("Show goodsList successfully!");
		
		boolean resultOfAddClient = salesBLService.addClient(new ClientVO());
		if(resultOfAddClient)
			System.out.println("Add client successfully!");
		
		boolean resultOfAddGoods = salesBLService.addGoods("", 1, 1, "test");
		if(resultOfAddGoods)
			System.out.println("Add goods successfully!");
		
		boolean resultOfAddOtherInfo = salesBLService.addOtherInfo(new SalesInfoVO());
		if(resultOfAddOtherInfo)
			System.out.println("Add other import infomation successfully!");
		
		ArrayList<SalesVO> salesVOs = salesBLService.showSales();
		if(salesVOs != null)
			System.out.println("Show import list successfully!");
		
		boolean resultOfSalesReturn = salesBLService.salesReturn(0);
		if(resultOfSalesReturn)
			System.out.println("Sales return successfully!");
		
		double total = salesBLService.getTotal();
		if(total == 0)
			System.out.println("Get total success!"+ " The total is " + total);
		
		boolean resultOfCreateSales = salesBLService.creatSales();
		if (resultOfCreateSales)
			System.out.println("Creat sales successfully!");
		
	}
	
	public static void main(String[] args) throws RemoteException {
		SalesBLService salesController = new SalesBLService_Stub();
		new SalesBLService_Driver().drive(salesController);
	}
}
