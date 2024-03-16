/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entity;
import exception.EmptyInputException;

public class Penjoki {
    private int id;
    private String nama;
    private String nama_game;
    private int total_pengalaman;

    public Penjoki(int id, String nama, String nama_game, int total_pengalaman) {
        this.id = id;
        this.nama = nama;
        this.nama_game = nama_game;
        this.total_pengalaman = total_pengalaman;
    }

    public Penjoki(String nama, String nama_game, int total_pengalaman) throws EmptyInputException{
        if(nama.isEmpty() || nama_game.isEmpty() || Integer.toString(total_pengalaman).isEmpty()) 
            throw new EmptyInputException();
        
        this.nama = nama;
        this.nama_game = nama_game;
        this.total_pengalaman = total_pengalaman;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama_game() {
        return nama_game;
    }

    public void setNama_game(String nama_game) {
        this.nama_game = nama_game;
    }

    public int getTotal_pengalaman() {
        return total_pengalaman;
    }

    public void setTotal_pengalaman(int total_pengalaman) {
        this.total_pengalaman = total_pengalaman;
    }
    
    @Override
    public String toString(){
        return nama;
    }
}
