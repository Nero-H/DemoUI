package businesslogicservice.stockblservice;
import java.rmi.RemoteException;

import po.StockCheckListPO;
import vo.DailyStockVO;
import vo.GiftlistVO;
import vo.StateVO;
import vo.WarningVO;



public interface StockBLService {
	public StockCheckListPO checkStock (String time1, String time2) throws RemoteException;
	public DailyStockVO checkDailyStock () throws RemoteException;
	public StateVO reportStock() throws RemoteException;
	public GiftlistVO giveGift(String ID ,int num) throws RemoteException;
	public WarningVO warning () throws RemoteException;
	
}
