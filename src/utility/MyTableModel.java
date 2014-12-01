/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author administrasion
 */
public class MyTableModel extends DefaultTableModel{

    public MyTableModel(Vector data, Vector colName) {
        super(data,colName);
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
