/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import connection.DBConnection;

import entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private DBConnection dbCon = new DBConnection();
    private Connection con;
    
    public void insertUser(User u){
        con = dbCon.makeConnection();
        
        String sql = "insert into user(username, password, name)"
                     + "values('"+ u.getUsername() + "', '" 
                     + u.getPassword() + "', '" + u.getNama() + "')";
        
        System.out.println("Adding User...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " User");
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding User...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public List<User> showUser(){
        con = dbCon.makeConnection();
        
        String sql = "select * from user";
        System.out.println("Mengambil data User...");
        
        List <User> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
               while(rs.next()){
                   User u = new User(
                            rs.getInt("id_user"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("name")
                           );
                   
                   list.add(u);
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
        
    public void updateUser(User u){
        con = dbCon.makeConnection();
        
       String sql = "UPDATE user SET username = '" + u.getUsername()
                + "', password = '" + u.getPassword()
                + "', name = '" + u.getNama()
                + "' WHERE id_user = " + u.getId();
        
        System.out.println("Editing User...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " User " + u.getId());
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing User...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteUser(int id){
        con = dbCon.makeConnection();
        
        String sql = "delete from user where id_user = '" + id + "'";
        
        System.out.println("Deleting User...");
        
        try{
            Statement statement = con.createStatement();
            
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " User " + id);
            
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting User...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
}
