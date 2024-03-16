/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import entity.Pemesanan;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PemesananAdminTable extends AbstractTableModel{
     private List<Pemesanan> list;

    public PemesananAdminTable(List<Pemesanan> list) {
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 9;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getUser().getUsername();
            case 1:
                return list.get(rowIndex).getUsername_game();
            case 2:
                return list.get(rowIndex).getPassword_game();
            case 3:
                return list.get(rowIndex).getNama_game();
            case 4:
                return list.get(rowIndex).getAwal_rank();
            case 5:
                return list.get(rowIndex).getTarget_rank();
            case 6:
                return list.get(rowIndex).getBiaya();
            case 7:
                return list.get(rowIndex).getStatus_pemesanan();
            case 8:
                return list.get(rowIndex).getPenjoki().getId() == 0 ? "Unassigned" : list.get(rowIndex).getPenjoki().getNama();
            case 9:
                return list.get(rowIndex).getId(); //ID PEMESANAN
            case 10:
                return list.get(rowIndex).getUser().getId(); //ID USER
            case 11:
                return list.get(rowIndex).getPenjoki().getId(); //ID PENJOKI
            default:
                throw null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Username";
            case 1:
                return "Username Game";
            case 2:
                return "Password Game";
            case 3:
                return "Nama Game";
            case 4:
                return "Awal Rank";
            case 5:
                return "Target Rank";
            case 6:
                return "Biaya";
            case 7:
                return "Status Pemesanan";
            case 8:
                return "Nama Penjoki";
            default:
                throw null;
        }
    }
}
