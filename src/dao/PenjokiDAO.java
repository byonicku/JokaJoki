/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import connection.DBConnection;

import entity.Penjoki;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PenjokiDAO {
    private DBConnection dbCon = new DBConnection();
    private Connection con;
    
    public void insertPenjoki(Penjoki p){
        con = dbCon.makeConnection();
        
        String sql = "insert into penjoki(nama, nama_game, total_pengalaman)"
                     + "values('"+ p.getNama()+ "', '" 
                     + p.getNama_game()+ "', '" + p.getTotal_pengalaman()+ "')";
        
        System.out.println("Adding Penjoki...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Penjoki");
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Penjoki...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public List<Penjoki> showPenjoki(){
        con = dbCon.makeConnection();
        
        String sql = "select * from penjoki";
        System.out.println("Mengambil data Penjoki...");
        
        List <Penjoki> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
               while(rs.next()){
                   Penjoki p = new Penjoki(
                            rs.getInt("id_penjoki"),
                            rs.getString("nama"),
                            rs.getString("nama_game"),
                            rs.getInt("total_pengalaman")
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
    
    public List<Penjoki> showPenjokiGame(String game){
        con = dbCon.makeConnection();
        
        String sql = "select * from penjoki where nama_game = '" + game + "'";
        System.out.println("Mengambil data Penjoki...");
        
        List <Penjoki> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
               while(rs.next()){
                   Penjoki p = new Penjoki(
                            rs.getInt("id_penjoki"),
                            rs.getString("nama"),
                            rs.getString("nama_game"),
                            rs.getInt("total_pengalaman")
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
        
    public void updatePenjoki(Penjoki p){
        con = dbCon.makeConnection();
        
       String sql = "UPDATE penjoki SET nama = '" + p.getNama()
                + "', nama_game = '" + p.getNama_game()
                + "', total_pengalaman = '" + p.getTotal_pengalaman()
                + "' WHERE id_penjoki = " + p.getId();
        
        System.out.println("Editing Penjoki...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Penjoki " + p.getId());
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing Penjoki...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deletePenjoki(int id){
        con = dbCon.makeConnection();
        
        String sql = "delete from penjoki where id_penjoki = '" + id + "'";
        
        System.out.println("Deleting Penjoki...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Penjoki " + id);
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting Penjoki...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
}
