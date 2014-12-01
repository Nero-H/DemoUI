/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoui.financialui;

import businesslogicservice.financialblservice.CashRecordBLService;
import businesslogicservice.financialblservice.MoneyBLService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.ClientStart;
import utility.MyAbstractTableModel;
import vo.AccountVO;
import vo.CashRecordLineItemVO;
import vo.FinancialReceiptLineItemVO;
import vo.MoneyLineItemVO;
import vo.MoneyVO;
import vo.PayVO;
import vo.ReceiptType;

/**
 *
 * @author administrasion
 */
public class FinancialReceiptItemTableModel extends MyAbstractTableModel<FinancialReceiptLineItemVO>{    

    ReceiptType type;
    public FinancialReceiptItemTableModel(ArrayList<FinancialReceiptLineItemVO> data, ArrayList columnNames,ReceiptType type) {
        super(data, columnNames);
        this.type = type;
    }

    @Override
    public void insertRow(int row, FinancialReceiptLineItemVO rowData) {
        try {
            dataList.add(row,rowData);
            if(type != ReceiptType.CashRecord){
                MoneyBLService moneyBLService = ClientStart.getMoneyBLService(type);
                moneyBLService.addItem((MoneyLineItemVO)rowData); 
            }else{
                CashRecordBLService cashRecordBLService = ClientStart.getCashRecordBLService();
                cashRecordBLService.addItem((CashRecordLineItemVO)rowData);
            }
            fireTableRowsInserted(row, row);
        } catch (RemoteException ex) {
            Logger.getLogger(FinancialReceiptItemTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addRow(String name,double balance,String comment){
        if(type != ReceiptType.CashRecord){
            addRow(new MoneyLineItemVO(name, balance, comment));
        }else{
            addRow(new CashRecordLineItemVO(name, balance, comment));
        }
    }

    @Override
    public void removeRow(int row) {
        if(type != ReceiptType.CashRecord){
                MoneyBLService moneyBLService = ClientStart.getMoneyBLService(type);
            try {
                moneyBLService.delItem(row);
            } catch (RemoteException ex) {
                Logger.getLogger(FinancialReceiptItemTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
                CashRecordBLService cashRecordBLService = ClientStart.getCashRecordBLService();
            try {
                cashRecordBLService.delItem(row);
            } catch (RemoteException ex) {
                Logger.getLogger(FinancialReceiptItemTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        fireTableRowsDeleted(row, row);
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
         if(type != ReceiptType.CashRecord){
             MoneyLineItemVO moneyLineItemVO = (MoneyLineItemVO)dataList.get(row);
             switch(column){
                 case 0: moneyLineItemVO.setAccountId((String)aValue);break;
                 case 1: moneyLineItemVO.setSum((Double)aValue);break;
                 case 2: moneyLineItemVO.setComment((String)aValue);break;
             }
             MoneyBLService moneyBLService = ClientStart.getMoneyBLService(type);
             try {
                 moneyBLService.updateItem(aValue, row, column);
             } catch (RemoteException ex) {
                 Logger.getLogger(FinancialReceiptItemTableModel.class.getName()).log(Level.SEVERE, null, ex);
             }
                
         }else{
                CashRecordLineItemVO cashRecordLineItemVO = (CashRecordLineItemVO)dataList.get(row);
                switch(column){
                    case 0: cashRecordLineItemVO.setName((String)aValue);
                    case 1: cashRecordLineItemVO.setSum((Double)aValue);
                    case 2: cashRecordLineItemVO.setComment((String)aValue);
                }
                CashRecordBLService cashRecordBLService = ClientStart.getCashRecordBLService();
             try {
                 cashRecordBLService.updateItem(aValue, row, column);
             } catch (RemoteException ex) {
                 Logger.getLogger(FinancialReceiptItemTableModel.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(type != ReceiptType.CashRecord){
            MoneyLineItemVO moneyLineItemVO = (MoneyLineItemVO)dataList.get(rowIndex);
            switch(columnIndex){
                case 0: return moneyLineItemVO.getAccountId();
                case 1: return moneyLineItemVO.getSum();
                case 2: return moneyLineItemVO.getComment();
            }
        }else{
            CashRecordLineItemVO cashRecordLineItemVO = (CashRecordLineItemVO)dataList.get(rowIndex);
            switch(columnIndex){
                case 0: return cashRecordLineItemVO.getName();
                case 1: return cashRecordLineItemVO.getSum();
                case 2: return cashRecordLineItemVO.getComment();
            }
        }
        return null;
    }
    
  
    
}
