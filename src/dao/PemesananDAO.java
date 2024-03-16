/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import connection.DBConnection;

import entity.Pemesanan;
import entity.Penjoki;
import entity.User;
    
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PemesananDAO {
    private DBConnection dbCon = new DBConnection();
    private Connection con;
    
    public void insertPemesanan(Pemesanan p){
        con = dbCon.makeConnection();
        
        String sql = "insert into pemesanan(id_user, username_game, password_game, nama_game, awal_rank, target_rank, biaya, status_pemesanan)"
                     + "values('"+ p.getUser().getId() + "', '" 
                     + p.getUsername_game()+ "', '" + p.getPassword_game()+ "', '" 
                     + p.getNama_game()+ "', '" + p.getAwal_rank()+ "', '" 
                     + p.getTarget_rank() + "', '" + p.getBiaya() + "', '" 
                     + p.getStatus_pemesanan()+ "')";
        
        System.out.println("Adding Pemesanan...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Pemesanan");
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Pemesanan...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public List<Pemesanan> showPemesanan(String query){
        con = dbCon.makeConnection();
        
        String sql = "select pe.*, p.*, u.* from pemesanan as pe left join penjoki as p on(pe.id_penjoki = p.id_penjoki) join user as u on(u.id_user = pe.id_user)"
                    + "where (pe.username_game LIKE " + "'%" + query + "%'"
                    + "OR pe.password_game LIKE '%" + query + "%'"
                    + "OR pe.nama_game LIKE '%" + query + "%'"
                    + "OR pe.awal_rank LIKE '%" + query + "%'"
                    + "OR pe.target_rank LIKE '%" + query + "%'"
                    + "OR pe.biaya LIKE '%" + query + "%'"
                    + "OR pe.status_pemesanan LIKE '%" + query + "%'"
                    + "OR u.username LIKE '%" + query + "%'"
                    + "OR p.nama LIKE '%" + query + "%') ORDER BY pe.status_pemesanan DESC";
        
        System.out.println("Mengambil data Pemesanan...");
        
        List <Pemesanan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
               while(rs.next()){
                   User u = new User(
                            rs.getInt("u.id_user"),
                            rs.getString("u.username"),
                            rs.getString("u.password"),
                            rs.getString("u.name")
                            );
                   
                       Penjoki pjk = new Penjoki(
                            rs.getInt("p.id_penjoki"),
                            rs.getString("p.nama"),
                            rs.getString("p.nama_game"),
                            rs.getInt("p.total_pengalaman")
                            );
                   

                   Pemesanan p = new Pemesanan(
                            rs.getInt("pe.id_pemesanan"),
                            rs.getString("pe.username_game"),
                            rs.getString("pe.password_game"),
                            rs.getString("pe.nama_game"),
                            rs.getString("pe.awal_rank"),
                            rs.getString("pe.target_rank"),
                            rs.getInt("pe.biaya"),
                            rs.getString("pe.status_pemesanan"),
                            pjk,
                            u
                           );
                   
                   list.add(p);
               }
            }
            
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return list;
    }
    
    public List<Pemesanan> showPemesananPendingOngoing(){
        con = dbCon.makeConnection();
        
        String sql = "select pe.*, p.*, u.* from pemesanan as pe left join penjoki as p on(pe.id_penjoki = p.id_penjoki) join user as u on(u.id_user = pe.id_user)"
                    + "where (pe.status_pemesanan = 'Pending'"
                    + "OR pe.status_pemesanan = 'On-going') ORDER BY pe.status_pemesanan DESC";
        
        System.out.println("Mengambil data Pemesanan...");
        
        List <Pemesanan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
               while(rs.next()){
                   User u = new User(
                            rs.getInt("u.id_user"),
                            rs.getString("u.username"),
                            rs.getString("u.password"),
                            rs.getString("u.name")
                            );
                   
                       Penjoki pjk = new Penjoki(
                            rs.getInt("p.id_penjoki"),
                            rs.getString("p.nama"),
                            rs.getString("p.nama_game"),
                            rs.getInt("p.total_pengalaman")
                            );
                   

                   Pemesanan p = new Pemesanan(
                            rs.getInt("pe.id_pemesanan"),
                            rs.getString("pe.username_game"),
                            rs.getString("pe.password_game"),
                            rs.getString("pe.nama_game"),
                            rs.getString("pe.awal_rank"),
                            rs.getString("pe.target_rank"),
                            rs.getInt("pe.biaya"),
                            rs.getString("pe.status_pemesanan"),
                            pjk,
                            u
                           );
                   
                   list.add(p);
               }
            }
            
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return list;
    }
    
    public List<Pemesanan> showPemesananUser(int id, String query){
        con = dbCon.makeConnection();
        
        String sql = "select pe.* from pemesanan as pe where id_user = " + id + " AND"
                + " (pe.username_game LIKE " + "'%" + query + "%'"
                + " OR pe.nama_game LIKE " + "'%" + query + "%'"
                + " OR pe.status_pemesanan LIKE " + "'%" + query + "%') ORDER BY pe.status_pemesanan";
        
        System.out.println("Mengambil data Pemesanan...");
        
        List <Pemesanan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
               while(rs.next()){
                   Pemesanan p = new Pemesanan(
                            rs.getInt("pe.id_pemesanan"),
                            rs.getString("pe.username_game"),
                            rs.getString("pe.password_game"),
                            rs.getString("pe.nama_game"),
                            rs.getString("pe.awal_rank"),
                            rs.getString("pe.target_rank"),
                            rs.getInt("pe.biaya"),
                            rs.getString("pe.status_pemesanan")
                           );
                   
                   list.add(p);
               }
            }
            
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return list;
    }
        
    public void updatePemesanan(Pemesanan p){
        con = dbCon.makeConnection();
        
       String sql = "UPDATE pemesanan SET username_game = '" + p.getUsername_game()
                + "', password_game = '" + p.getPassword_game() 
                + "', nama_game = '" + p.getNama_game()
                + "', awal_rank = '" + p.getAwal_rank()
                + "', target_rank = '" + p.getTarget_rank()
                + "', biaya = '" + p.getBiaya()
                + "', status_pemesanan = '" + p.getStatus_pemesanan()
                + "' WHERE id_pemesanan = " + p.getId();
        
        System.out.println("Editing Pemesanan...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Pemesanan " + p.getId());
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing Pemesanan...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void setPenjokiDanStatus(Pemesanan p){
         con = dbCon.makeConnection();
        
       String sql = "UPDATE pemesanan SET id_penjoki = '" + p.getPenjoki().getId()
                + "', status_pemesanan = '" + p.getStatus_pemesanan()
                + "' WHERE id_pemesanan = " + p.getId();
        
        System.out.println("Editing Pemesanan...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Pemesanan " + p.getId());
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing Pemesanan...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
        
    
    public void deletePemesanan(int id){
        con = dbCon.makeConnection();
        
        String sql = "delete from pemesanan where id_pemesanan = '" + id + "'";
        
        System.out.println("Deleting Pemesanan...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Pemesanan " + id);
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting Pemesanan...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
}
