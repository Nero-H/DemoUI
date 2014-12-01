package businesslogicservice.stockblservice;

import java.rmi.RemoteException;
import vo.StockVO;

public interface StockChangeRecord {

	public void  StockChange (StockVO stockVO) throws RemoteException;
}
