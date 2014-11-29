package businesslogicservice.clientblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.ClientVO;

public interface ClientBLService extends Remote{
	public boolean addClient(ClientVO vo) throws RemoteException;
	public boolean deleteClient(String num) throws RemoteException;
	public boolean changeClient(ClientVO vo) throws RemoteException;
	public ClientVO findClientByNum(String num) throws RemoteException;
	public ArrayList<ClientVO> findCientByKey(String key) throws RemoteException;
	public ArrayList<ClientVO> getClientList() throws RemoteException;
	public ClientVO getMessage() throws RemoteException;
}
