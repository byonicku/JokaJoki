/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import entity.Penjoki;
import dao.PenjokiDAO;

import java.util.List;
import table.PenjokiTable;

public class PenjokiControl {
    private PenjokiDAO penjokiDAO = new PenjokiDAO();
    
    public void insertPenjoki(Penjoki p){
        penjokiDAO.insertPenjoki(p);
    }
    
    public PenjokiTable getTablePenjoki(){
        return new PenjokiTable(penjokiDAO.showPenjoki());
    }
    
    
    public List<Penjoki> getPenjoki(){
        return penjokiDAO.showPenjoki();
    }
    
    public List<Penjoki> getPenjokiSpecific(String game){
        return penjokiDAO.showPenjokiGame(game);
    }
    
    public void updatePenjoki(Penjoki p){
        penjokiDAO.updatePenjoki(p);
    }
    
    public void deletePenjoki(int id){
        penjokiDAO.deletePenjoki(id);
    }
}
