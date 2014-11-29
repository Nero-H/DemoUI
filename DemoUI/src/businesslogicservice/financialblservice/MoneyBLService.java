package businesslogicservice.financialblservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import utility.TimePeriod;
import vo.MoneyLineItemVO;
import vo.PayVO;
import vo.ReceiptType;
import vo.ReceiveVO;

public interface MoneyBLService {
	public boolean addItem(MoneyLineItemVO vo) throws RemoteException;
	
	public boolean delItem(int row);
	
	public boolean updateItem(Object value,int row,int col);
	
	public String getSerialNumber();
	
	public boolean setClient(String clientId);
	
	public String getUser();
	
	public double getSum();
	
	public ArrayList<PayVO> mutipleConditionFindPay(TimePeriod period, String cliendName,String userName,String accountName);

	public ArrayList<ReceiveVO> mutipleConditionFindReceive(TimePeriod period, String clientName,String userName,String acountName);

	public boolean finish(ReceiptType type);
}
