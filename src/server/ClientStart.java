/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author HCW
 */
import businesslogicservice.clientblservice.ClientBLService;
import businesslogicservice.financialblservice.AccountBLService;
import businesslogicservice.financialblservice.CashRecordBLService;
import businesslogicservice.financialblservice.MoneyBLService;
import businesslogicservice.importblservice.ImportBLService;
import businesslogicservice.saleblservice.SalesBLService;
import businesslogicservice.stockblservice.GoodsManageBLService;
import businesslogicservice.userblservice.LoginBLService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.ReceiptType;


public class ClientStart {
    public static ServerInterface server;
	public static void main() {
		try {
                    server = (ServerInterface)Naming.lookup("rmi://127.0.0.1:5000/ServerInterface");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public ClientStart(){
        try {
                    server = (ServerInterface)Naming.lookup("rmi://127.0.0.1:5000/ServerInterface");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public static ClientBLService getClientBLService() {
        ClientBLService clientBLService = null;
        try {
            clientBLService = server.getClientService();
        } catch (RemoteException ex) {
            Logger.getLogger(ClientStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientBLService;
    }
     public static ImportBLService getImportBLService() {
        ImportBLService importBLService = null;
        try {
            importBLService = server.getImportBLService();
        } catch (RemoteException ex) {
            Logger.getLogger(ClientStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return importBLService;
    }
      public static SalesBLService getSalesBLService() {
          SalesBLService salesBLService = null;
        try {
            salesBLService = server.getSalesBLService();
        } catch (RemoteException ex) {
            Logger.getLogger(ClientStart.class.getName()).log(Level.SEVERE, null, ex);
        }
          return salesBLService;
    }
      
      public static AccountBLService getAccountBLService() {
        AccountBLService accountBLService = null;
        try {
            accountBLService = server.getAccountBLService();
        } catch (RemoteException ex) {
            Logger.getLogger(ClientStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountBLService;
    }
      
      public static MoneyBLService getMoneyBLService(ReceiptType type){
          MoneyBLService moneyBLService = null;
          try {
            moneyBLService = server.getMoneyBLService(type);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return moneyBLService;
      }

      
      public static CashRecordBLService getCashRecordBLService(){
          CashRecordBLService cashRecordBLService = null;
          try {
            cashRecordBLService = server.getCashRecordBLService();
        } catch (RemoteException ex) {
            Logger.getLogger(ClientStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cashRecordBLService;
      }
      
      public static GoodsManageBLService getGoodsManageBLService(){
          GoodsManageBLService goodsManageBLService = null;
          try {
              goodsManageBLService = server.getGoodsManageBLService();
          } catch (RemoteException ex) {
              Logger.getLogger(ClientStart.class.getName()).log(Level.SEVERE, null, ex);
          }
          return goodsManageBLService;
       }
}

