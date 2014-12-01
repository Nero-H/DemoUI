package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.ReceiptType;
import businesslogicservice.clientblservice.ClientBLService;
import businesslogicservice.examingblservice.Examingblservice;
import businesslogicservice.financialblservice.AccountBLService;
import businesslogicservice.financialblservice.CashRecordBLService;
import businesslogicservice.financialblservice.MoneyBLService;
import businesslogicservice.importblservice.ImportBLService;
import businesslogicservice.promotionblservice.PromotionBLService;
import businesslogicservice.saleblservice.SalesBLService;
import businesslogicservice.stockblservice.GoodsManageBLService;
import businesslogicservice.userblservice.LoginBLService;
import businesslogicservice.userblservice.UserBLService;

public interface ServerInterface extends Remote{
	public ClientBLService getClientService() throws RemoteException;
    public ImportBLService getImportBLService() throws  RemoteException;
    public SalesBLService getSalesBLService() throws RemoteException;
	public AccountBLService getAccountBLService() throws RemoteException;
	public MoneyBLService getMoneyBLService(ReceiptType type) throws RemoteException;
	public CashRecordBLService getCashRecordBLService() throws RemoteException;
	public UserBLService getUserdataservice() throws RemoteException;
	public PromotionBLService getPromotionBLService() throws RemoteException;
	public Examingblservice getExamingblservice() throws RemoteException;
	public LoginBLService getLoginBLService() throws RemoteException;
	public GoodsManageBLService getGoodsManageBLService() throws RemoteException;
}
