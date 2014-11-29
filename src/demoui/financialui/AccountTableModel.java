/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoui.financialui;

import java.util.ArrayList;
import utility.MyAbstractTableModel;
import vo.AccountVO;

/**
 *
 * @author administrasion
 */
public class AccountTableModel extends MyAbstractTableModel<AccountVO>{

    public AccountTableModel(ArrayList<AccountVO> data, ArrayList columnNames) {
        super(data, columnNames);
    }

    @Override
    public void insertRow(int row, AccountVO rowData) {
        dataList.add(row,rowData);
        
        fireTableRowsInserted(row, row);
    }

    @Override
    public void removeRow(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
