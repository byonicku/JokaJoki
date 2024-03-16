/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import entity.Pemesanan;
import dao.PemesananDAO;

import java.util.List;

import table.PemesananUserTable;
import table.PemesananAdminTable;

public class PemesananControl {
    private PemesananDAO pemesananDAO = new PemesananDAO();
    
    public void insertPemesanan(Pemesanan p){
        pemesananDAO.insertPemesanan(p);
    }
    
    public List<Pemesanan> getPemesananAdmin(String query){
        return pemesananDAO.showPemesanan(query);
    }
    
    public PemesananUserTable getTablePemesananUser(int id, String query){
        return new PemesananUserTable(pemesananDAO.showPemesananUser(id, query));
    }
    
    public PemesananAdminTable getTablePemesananAdmin(String query){
        return new PemesananAdminTable(getPemesananAdmin(query));
    }
    
    public PemesananAdminTable getTablePemesananAdminPendingOngoing(){
        return new PemesananAdminTable(pemesananDAO.showPemesananPendingOngoing());
    }
    
    public void updatePemesanan(Pemesanan p){
        pemesananDAO.updatePemesanan(p);
    }
    
    public void updatePenjokiStatus(Pemesanan p){
        pemesananDAO.setPenjokiDanStatus(p);
    }
    
    public void deletePemesanan(int id){
        pemesananDAO.deletePemesanan(id);
    }
}
