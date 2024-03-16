/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import entity.Pemesanan;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PemesananUserTable extends AbstractTableModel{
    private List<Pemesanan> list;

    public PemesananUserTable(List<Pemesanan> list) {
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
                return list.get(rowIndex).getUsername_game();
            case 1:
                return list.get(rowIndex).getNama_game();
            case 2:
                return list.get(rowIndex).getStatus_pemesanan();
            default:
                throw null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Username";
            case 1:
                return "Nama Game";
            case 2:
                return "Status Pemesanan";
            default:
                throw null;
        }
    }
}
