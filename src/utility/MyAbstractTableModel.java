/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utility;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author administrasion
 */
public abstract class MyAbstractTableModel<T> extends AbstractTableModel implements Serializable {

//
// Instance Variables
//

    /**
     * The <code>Vector</code> of <code>Vectors</code> of
     * <code>Object</code> values.
     */
    protected ArrayList<T>    dataList;

    /** The <code>Vector</code> of column identifiers. */
    protected ArrayList   columnIdentifiers;


    /**
     *  Constructs a <code>DefaultTableModel</code> and initializes the table
     *  by passing <code>data</code> and <code>columnNames</code>
     *  to the <code>setDataVector</code> method.
     *
     * @param data              the data of the table, a <code>Vector</code>
     *                          of <code>Vector</code>s of <code>Object</code>
     *                          values
     * @param columnNames       <code>vector</code> containing the names
     *                          of the new columns
     * @see #getDataVector
     * @see #setDataVector
     */
    public MyAbstractTableModel(ArrayList<T> data, ArrayList columnNames) {
        this.dataList = data;
        this.columnIdentifiers = columnNames;
    }


    /**
     *  Returns the <code>Vector</code> of <code>Vectors</code>
     *  that contains the table's
     *  data values.  The vectors contained in the outer vector are
     *  each a single row of values.  In other words, to get to the cell
     *  at row 1, column 5: <p>
     *
     *  <code>((Vector)getDataVector().elementAt(1)).elementAt(5);</code><p>
     *
     * @return  the vector of vectors containing the tables data values
     *
     * @see #newDataAvailable
     * @see #newRowsAdded
     * @see #setDataVector
     */
    public ArrayList<T> getDataList() {
        return dataList;
    }


    /**
     *  Equivalent to <code>fireTableChanged</code>.
     *
     * @param event  the change event
     *
     */
    public void newDataAvailable(TableModelEvent event) {
        fireTableChanged(event);
    }


    /**
     *  Ensures that the new rows have the correct number of columns.
     *  This is accomplished by  using the <code>setSize</code> method in
     *  <code>Vector</code> which truncates vectors
     *  which are too long, and appends <code>null</code>s if they
     *  are too short.
     *  This method also sends out a <code>tableChanged</code>
     *  notification message to all the listeners.
     *
     * @param e         this <code>TableModelEvent</code> describes
     *                           where the rows were added.
     *                           If <code>null</code> it assumes
     *                           all the rows were newly added
     * @see #getDataVector
     */
    public void newRowsAdded(TableModelEvent e) {
        fireTableChanged(e);
    }

    /**
     *  Equivalent to <code>fireTableChanged</code>.
     *
     *  @param event the change event
     *
     */
    public void rowsRemoved(TableModelEvent event) {
        fireTableChanged(event);
    }


    /**
     *  Adds a row to the end of the model.  The new row will contain
     *  <code>null</code> values unless <code>rowData</code> is specified.
     *  Notification of the row being added will be generated.
     *
     * @param   rowData          optional data of the row being added
     */
    public void addRow(T rowData) {
        insertRow(getRowCount(), rowData);
    }

    /**
     *  Inserts a row at <code>row</code> in the model.  The new row
     *  will contain <code>null</code> values unless <code>rowData</code>
     *  is specified.  Notification of the row being added will be generated.
     *
     * @param   row             the row index of the row to be inserted
     * @param   rowData         optional data of the row being added
     * @exception  ArrayIndexOutOfBoundsException  if the row was invalid
     */
    abstract public void insertRow(int row, T rowData);


    private static int gcd(int i, int j) {
        return (j == 0) ? i : gcd(j, i%j);
    }

    private static void rotate(ArrayList v, int a, int b, int shift) {
        int size = b - a;
        int r = size - shift;
        int g = gcd(size, r);
        for(int i = 0; i < g; i++) {
            int to = i;
            Object tmp = v.get(a + to);
            for(int from = (to + r) % size; from != i; from = (to + r) % size) {
                v.set(a + to , v.get(a + from));
                to = from;
            }
            v.set(a + to , tmp);
        }
    }

    /**
     *  Moves one or more rows from the inclusive range <code>start</code> to
     *  <code>end</code> to the <code>to</code> position in the model.
     *  After the move, the row that was at index <code>start</code>
     *  will be at index <code>to</code>.
     *  This method will send a <code>tableChanged</code> notification
     *  message to all the listeners. <p>
     *
     *  <pre>
     *  Examples of moves:
     *  <p>
     *  1. moveRow(1,3,5);
     *          a|B|C|D|e|f|g|h|i|j|k   - before
     *          a|e|f|g|h|B|C|D|i|j|k   - after
     *  <p>
     *  2. moveRow(6,7,1);
     *          a|b|c|d|e|f|G|H|i|j|k   - before
     *          a|G|H|b|c|d|e|f|i|j|k   - after
     *  <p>
     *  </pre>
     *
     * @param   start       the starting row index to be moved
     * @param   end         the ending row index to be moved
     * @param   to          the destination of the rows to be moved
     * @exception  ArrayIndexOutOfBoundsException  if any of the elements
     * would be moved out of the table's range
     *
     */
    public void moveRow(int start, int end, int to) {
        int shift = to - start;
        int first, last;
        if (shift < 0) {
            first = to;
            last = end;
        }
        else {
            first = start;
            last = to + end - start;
        }
        rotate(dataList, first, last + 1, shift);

        fireTableRowsUpdated(first, last);
    }

    /**
     *  Removes the row at <code>row</code> from the model.  Notification
     *  of the row being removed will be sent to all the listeners.
     *
     * @param   row      the row index of the row to be removed
     * @exception  ArrayIndexOutOfBoundsException  if the row was invalid
     */
    abstract public void removeRow(int row);


//
// Implementing the TableModel interface
//

    /**
     * Returns the number of rows in this data table.
     * @return the number of rows in the model
     */
    public int getRowCount() {
        return dataList.size();
    }

    /**
     * Returns the number of columns in this data table.
     * @return the number of columns in the model
     */
    public int getColumnCount() {
        return columnIdentifiers.size();
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    /**
     * Returns the column name.
     *
     * @return a name for this column using the string value of the
     * appropriate member in <code>columnIdentifiers</code>.
     * If <code>columnIdentifiers</code> does not have an entry
     * for this index, returns the default
     * name provided by the superclass.
     */
    public String getColumnName(int column) {
        Object id = null;
        // This test is to cover the case when
        // getColumnCount has been subclassed by mistake ...
        if (column < columnIdentifiers.size() && (column >= 0)) {
            id = columnIdentifiers.get(column);
        }
        return (id == null) ? super.getColumnName(column)
                            : id.toString();
    }

    /**
     * Returns true regardless of parameter values.
     *
     * @param   row             the row whose value is to be queried
     * @param   column          the column whose value is to be queried
     * @return                  true
     * @see #setValueAt
     */
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    /**
     * Returns an attribute value for the cell at <code>row</code>
     * and <code>column</code>.
     *
     * @param   row             the row whose value is to be queried
     * @param   column          the column whose value is to be queried
     * @return                  the value Object at the specified cell
     * @exception  ArrayIndexOutOfBoundsException  if an invalid row or
     *               column was given
     */
    
    /*
    public Object getValueAt(int row, int column) {
        T rowObject = dataList.get(row);
        switch(column){
            case 0:return rowObject;
            default: return rowObject;
        }
    }
    */
    /**
     * Sets the object value for the cell at <code>column</code> and
     * <code>row</code>.  <code>aValue</code> is the new value.  This method
     * will generate a <code>tableChanged</code> notification.
     *
     * @param   aValue          the new value; this can be null
     * @param   row             the row whose value is to be changed
     * @param   column          the column whose value is to be changed
     * @exception  ArrayIndexOutOfBoundsException  if an invalid row or
     *               column was given
     */
    

    public abstract void setValueAt(Object aValue, int row, int column);/*{
        T rowObject = dataList.get(row);
        switch(column){
            case 0: break;
        }
        fireTableCellUpdated(row, column);
    }
    */
  
    public T getDataAt(int row){
        return dataList.get(row);
    }
//


  

} // End of class DefaultTableModel

