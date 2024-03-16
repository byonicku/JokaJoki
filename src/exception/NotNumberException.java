/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exception;

public class NotNumberException extends Exception{
    public String message(String inp){
        return "Input " + inp + " hanya terdiri dari angka saja!";
    }
}
