package businesslogicservice.financialblservice;

import java.rmi.RemoteException;

import vo.AccountVO;
import vo.UpdateAccountVO;

public interface AccountBLService {
	public boolean addAccount(AccountVO vo) throws RemoteException;
	
	public boolean delAccount(String name) throws RemoteException;
	
	public boolean updateAccount(UpdateAccountVO vo) throws RemoteException;
	
	public AccountVO findAccount(String name) throws RemoteException;

	public boolean in(String accountName,double sum);
	
	public boolean out(String accountName,double sum);
}
