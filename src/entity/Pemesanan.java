/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entity;
import exception.EmptyInputException;

public class Pemesanan {
    private int id;
    private String username_game;
    private String password_game;
    private String nama_game;
    private String awal_rank;
    private String target_rank;
    private int biaya;
    private String status_pemesanan;
    
    private Penjoki penjoki;
    private User user;
    
    //Constructor untuk menampilkan data ke tabel
    public Pemesanan(int id, String username_game, String password_game, String nama_game, String awal_rank, String target_rank, int biaya, String status_pemesanan, Penjoki penjoki, User user) {
        this.id = id;
        this.username_game = username_game;
        this.password_game = password_game;
        this.nama_game = nama_game;
        this.awal_rank = awal_rank;
        this.target_rank = target_rank;
        this.biaya = biaya;
        this.status_pemesanan = status_pemesanan;
        this.penjoki = penjoki;
        this.user = user;
    }
    
    //Constructor untuk membuat data pemesanan
    public Pemesanan(String username_game, String password_game, String nama_game, String awal_rank, String target_rank, int biaya, String status_pemesanan, int id_user, String username, String password, String nama) throws EmptyInputException{
        if(username_game.isEmpty() || password_game.isEmpty() || nama_game.isEmpty() || awal_rank.isEmpty() 
                || target_rank.isEmpty() || String.valueOf(biaya).isEmpty()) 
            throw new EmptyInputException();
        
        this.username_game = username_game;
        this.password_game = password_game;
        this.nama_game = nama_game;
        this.awal_rank = awal_rank;
        this.target_rank = target_rank;
        this.biaya = biaya;
        this.status_pemesanan = status_pemesanan;
        this.user = new User(id_user, username, password, nama);
    }
    
    //Constructor untuk menampilkan pesanan user
    public Pemesanan(int id, String username_game, String password_game, String nama_game, String awal_rank, String target_rank, int biaya, String status_pemesanan) {
        this.id = id;
        this.username_game = username_game;
        this.password_game = password_game;
        this.nama_game = nama_game;
        this.awal_rank = awal_rank;
        this.target_rank = target_rank;
        this.biaya = biaya;
        this.status_pemesanan = status_pemesanan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername_game() {
        return username_game;
    }

    public void setUsername_game(String username_game) {
        this.username_game = username_game;
    }

    public String getPassword_game() {
        return password_game;
    }

    public void setPassword_game(String password_game) {
        this.password_game = password_game;
    }

    public String getNama_game() {
        return nama_game;
    }

    public void setNama_game(String nama_game) {
        this.nama_game = nama_game;
    }

    public String getAwal_rank() {
        return awal_rank;
    }

    public void setAwal_rank(String awal_rank) {
        this.awal_rank = awal_rank;
    }

    public String getTarget_rank() {
        return target_rank;
    }

    public void setTarget_rank(String target_rank) {
        this.target_rank = target_rank;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String getStatus_pemesanan() {
        return status_pemesanan;
    }

    public void setStatus_pemesanan(String status_pemesanan) {
        this.status_pemesanan = status_pemesanan;
    }

    public Penjoki getPenjoki() {
        return penjoki;
    }

    public void setPenjoki(Penjoki penjoki) {
        this.penjoki = penjoki;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    } 
}
