package businesslogicservice.financialblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.AccountVO;
import vo.UpdateAccountVO;

public interface AccountBLService extends Remote{
	public boolean addAccount(AccountVO vo) throws RemoteException;
	
	public boolean delAccount(String name) throws RemoteException;
	
	public boolean updateAccount(UpdateAccountVO vo) throws RemoteException;
	
	public AccountVO findAccount(String name) throws RemoteException;
	
	public ArrayList<AccountVO> getList() throws RemoteException;

	public boolean in(String accountName,double sum) throws RemoteException;
	
	public boolean out(String accountName,double sum) throws RemoteException;
}
