package todo.ui;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ItemTableModel extends AbstractTableModel {

    List itemList;

    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }

    public String getColumnName(int column){
        return "Items11111";
    }

    public void setItemList(List inputItemList){
        this.itemList = inputItemList;
    }

    public int getColumnCount(){
        return 1;
    }

    public int getRowCount(){
        return itemList.size();
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex){
        itemList.set(rowIndex, value);
    }

    public Object getValueAt(int rowIndex, int columnIndex){
        return itemList.get(rowIndex);
    }

}
