package businesslogicservice.userblservice;

import java.rmi.RemoteException;


public interface LoginBLService {

	public boolean login(String id,String password) throws RemoteException;
	
	public String getUserName() throws RemoteException;
	
	public String getUserIdentity() throws RemoteException;
}
