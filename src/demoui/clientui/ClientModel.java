/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoui.clientui;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HCW
 */
public class ClientModel extends AbstractTableModel{
    @SuppressWarnings("rawtypes")
	Vector columnNames,rows;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ClientModel() {
		// TODO Auto-generated constructor stub
		columnNames=new Vector();
		columnNames.add("姓名");
		columnNames.add("类型");
		columnNames.add("ID");
		columnNames.add("密码");
		columnNames.add("等级");
		//f
		rows=new Vector();
		
		
		
	}
	
	@SuppressWarnings("unchecked")
	void addRow(Vector v){
		 rows.add(v); 
	 }
	
	void removeRow(int r){
		 rows.remove(r); 
	 }

	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.columnNames.size();
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.rows.size();
	}
	

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return (String)this.columnNames.get(column);
	}
	@Override
	public Class getColumnClass(int c) {  
		return getValueAt(0, c).getClass();  
	}
	@Override
	public Object getValueAt(int row, int column) {
		// TODO Auto-generated method stub
		return ((Vector)this.rows.get(row)).get(column);
	}
	@Override
	 public void setValueAt(Object value, int row, int column) {  
		 ((Vector)this.rows.get(row)).set(column, value);
		 fireTableCellUpdated(row, column);  
		 
	 }  
	 @Override
	 public boolean isCellEditable(int row, int col) {  
	        //Note that the data/cell address is constant,  
	        //no matter where the cell appears onscreen.  
	     if(col==2){
	    	 return false;
	     }   
		 return true;  
	        
	 }  
}
