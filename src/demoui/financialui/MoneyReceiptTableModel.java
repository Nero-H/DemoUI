/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoui.financialui;

import java.util.ArrayList;
import utility.MyDefaultTabelModel;
import vo.MoneyVO;

/**
 *
 * @author administrasion
 */
public class MoneyReceiptTableModel extends MyDefaultTabelModel<MoneyVO>{

    public MoneyReceiptTableModel(ArrayList<MoneyVO> data, ArrayList columnNames) {
        super(data, columnNames);
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MoneyVO money = dataList.get(rowIndex);
        switch(columnIndex){
            case 0:return money.getSerialNumber();
            case 1:return money.getClientName();
            case 2:return money.getUserName();
            case 3:return money.getSum();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
        
    }
    
}
