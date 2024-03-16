/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exception;

public class UsernameException extends Exception{
     public String message(String username){
        return "Username " + username + " tidak dapat dipakai";
    }
}
