package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import businesslogicservice.clientblservice.ClientBLService;
import businesslogicservice.importblservice.ImportBLService;
import businesslogicservice.saleblservice.SalesBLService;

public interface ServerInterface extends Remote{
	public ClientBLService getClientService() throws RemoteException;
        public ImportBLService getImportBLService() throws  RemoteException;
        public SalesBLService getSalesBLService() throws RemoteException;
}
