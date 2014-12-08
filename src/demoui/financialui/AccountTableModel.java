/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoui.financialui;

import businesslogicservice.financialblservice.AccountBLService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.ClientStart;
import utility.MyAbstractTableModel;
import vo.AccountVO;
import vo.UpdateAccountVO;

/**
 *
 * @author administrasion
 */
public class AccountTableModel extends MyAbstractTableModel<AccountVO>{

    public AccountTableModel(ArrayList<AccountVO> data,ArrayList columnNames) {
        super(data, columnNames);
    }

    @Override
    public void insertRow(int row, AccountVO rowData) {
        dataList.add(row,rowData);
        try {
            AccountBLService accountBLService = ClientStart.getAccountBLService();
            accountBLService.addAccount((AccountVO)rowData);
        } catch (RemoteException ex) {
            Logger.getLogger(AccountTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        fireTableRowsInserted(row, row);
    }
    
    /**
     *
     * @param name
     * @param balance
     */
    public void addRow(String name,double balance){
        addRow(new AccountVO(name, balance));
    }
    
    @Override
   public void removeRow(int row) {
        AccountVO object = dataList.remove(row);
          try {
            AccountBLService accountBLService = ClientStart.server.getAccountBLService();
            accountBLService.delAccount(object.getName());
        } catch (RemoteException ex) {
            Logger.getLogger(AccountTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        fireTableRowsDeleted(row, row);
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
        AccountVO rowObject = dataList.get(row);
        String oldName = rowObject.getName();
        switch(column){
            case 0: rowObject.setName((String)aValue);break;
            case 1: rowObject.setBalance((Double)aValue);break;
            default:System.out.println("accountTableModelSetValueAtError");
        }
        try {
            AccountBLService accountBLService = ClientStart.server.getAccountBLService();
            accountBLService.updateAccount(new UpdateAccountVO(oldName, rowObject.getName()));
        } catch (RemoteException ex) {
            Logger.getLogger(AccountTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AccountVO rowObject = dataList.get(rowIndex);
        switch(columnIndex){
            case 0: return rowObject.getName();
            case 1: return rowObject.getBalance();
            default:
                System.out.println("AccountTableModelGetValueError");
                return null;
        }
    }
    
    public int getIndexOf(String name){
        for(int i = 0 ; i < dataList.size() ; i ++){
            AccountVO account = dataList.get(i);
            if(account.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return true;
        }else{
            return false;
        }
    }
}
