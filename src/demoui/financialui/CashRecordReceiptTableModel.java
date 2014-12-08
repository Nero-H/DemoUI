/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoui.financialui;

import java.util.ArrayList;
import utility.MyDefaultTabelModel;
import vo.CashRecordVO;

/**
 *
 * @author administrasion
 */
public class CashRecordReceiptTableModel extends MyDefaultTabelModel<CashRecordVO>{

    public CashRecordReceiptTableModel(ArrayList<CashRecordVO> data, ArrayList columnNames) {
        super(data, columnNames);
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CashRecordVO cashRecord = dataList.get(rowIndex);
        switch(columnIndex){
            case 0:return cashRecord.getSerialNumber();
            case 1:return cashRecord.getUserName();
            case 2:return cashRecord.getAccountName();
            case 3:return cashRecord.getSum();
        }
        return null;
    }
    
}
