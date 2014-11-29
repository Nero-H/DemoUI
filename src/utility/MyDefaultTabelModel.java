/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.ArrayList;

/**
 *
 * @author administrasion
 */
public abstract class MyDefaultTabelModel<T> extends MyAbstractTableModel<T>{

    public MyDefaultTabelModel(ArrayList<T> data, ArrayList columnNames) {
        super(data, columnNames);
    }

    @Override
    public void insertRow(int row, T rowData) {
        dataList.add(rowData);
        fireTableRowsInserted(row, row);
    }

    @Override
    public void removeRow(int row) {
         dataList.remove(row);
         fireTableRowsDeleted(row, row);
    }
    
}
