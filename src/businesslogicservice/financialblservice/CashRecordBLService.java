package businesslogicservice.financialblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import utility.TimePeriod;
import vo.CashRecordLineItemVO;
import vo.CashRecordVO;

public interface CashRecordBLService extends Remote{
	public double addItem(CashRecordLineItemVO vo) throws RemoteException;
	public double delItem(int row) throws RemoteException;
	public double updateItem(Object value, int row,int col) throws RemoteException;
	public boolean setAccount(String accountId) throws RemoteException;
	public boolean finish() throws RemoteException;
	public ArrayList<CashRecordVO> mutipleConditionFind(TimePeriod period,String userName,String accountName) throws RemoteException;
	public String getSerialNumber() throws RemoteException;
	public String getUserName() throws RemoteException;
	public ArrayList<CashRecordVO> getList() throws RemoteException;
	public boolean setUser(String userName) throws RemoteException;
}
