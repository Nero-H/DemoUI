package businesslogicservice.financialblservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import utility.TimePeriod;
import vo.MoneyLineItemVO;
import vo.MoneyVO;
import vo.PayVO;
import vo.ReceiptType;
import vo.ReceiveVO;

public interface MoneyBLService {
	public boolean addItem(MoneyLineItemVO vo) throws RemoteException;
	
	public boolean delItem(int row) throws RemoteException;
	
	public boolean updateItem(Object value,int row,int col) throws RemoteException;
	
	public String getSerialNumber() throws RemoteException;
	
	public boolean setClient(String clientId) throws RemoteException;
	
	public String getUser() throws RemoteException;
	
	public double getSum() throws RemoteException;
	
	public ArrayList<MoneyVO> mutipleConditionFindPay(TimePeriod period, String cliendName,String userName,String accountName) throws RemoteException;

	public ArrayList<MoneyVO> mutipleConditionFindReceive(TimePeriod period, String clientName,String userName,String acountName) throws RemoteException;

	public boolean finish() throws RemoteException;
	
	public ArrayList<MoneyVO> getList() throws RemoteException;
}
