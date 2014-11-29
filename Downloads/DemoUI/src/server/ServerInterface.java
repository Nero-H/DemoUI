package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import businesslogicservice.clientblservice.ClientBLService;
import businesslogicservice.financialblservice.AccountBLService;

public interface ServerInterface extends Remote{
	public ClientBLService getClientService() throws RemoteException;
        public AccountBLService getAccountBLService() throws RemoteException;
}
