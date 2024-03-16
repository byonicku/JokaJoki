/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entity;
import exception.EmptyInputException;
import exception.UsernameException;

public class User {
    private int id;
    private String username;
    private String password;
    private String nama;

    public User(int id, String username, String password, String nama) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    public User(String username, String password, String nama) throws EmptyInputException, UsernameException{
        if(username.isEmpty() || password.isEmpty() || nama.isEmpty()) 
            throw new EmptyInputException();
        if(username.equals("admin") && password.equals("admin")) 
            throw new UsernameException();
        
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
