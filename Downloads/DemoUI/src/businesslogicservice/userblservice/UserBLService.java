package businesslogicservice.userblservice;

import java.rmi.RemoteException;

import vo.UserVO;

public interface UserBLService {
	
	public boolean login(String ID,String password) throws RemoteException;
	
	public boolean addUser(UserVO vo) throws RemoteException;
	
	public boolean deleteUser(UserVO vo) throws RemoteException;
	
	public boolean updateUser(UserVO vo) throws RemoteException;
	
	public String getUserIdentity() throws RemoteException;
		
	public String getUserName() throws RemoteException;
}
