package businesslogicservice.stockblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import utility.MyTreeNode;


public interface GoodsManageBLService extends Remote{
	public MyTreeNode getRoot() throws RemoteException;
	public void setRoot(MyTreeNode node) throws RemoteException;
}
