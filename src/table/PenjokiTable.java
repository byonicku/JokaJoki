/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import entity.Penjoki;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PenjokiTable extends AbstractTableModel{
    private List<Penjoki> list;

    public PenjokiTable(List<Penjoki> list) {
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 3;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNama();
            case 1:
                return list.get(rowIndex).getNama_game();
            case 2:
                return list.get(rowIndex).getTotal_pengalaman();
            case 3:
                return list.get(rowIndex).getId();
            default:
                throw null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nama";
            case 1:
                return "Nama Game";
            case 2:
                return "Total Pengalaman";
            default:
                throw null;
        }
    }
}
