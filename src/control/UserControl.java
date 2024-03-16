/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import entity.User;
import dao.UserDAO;

import java.util.List;

import exception.LoginException;
import exception.UserAlreadyCreatedException;

public class UserControl {
    private UserDAO userDAO = new UserDAO();
    private static User currentUser = null;
    
    public void insertUser(User u){
        userDAO.insertUser(u);
    }
    
    public List<User> getUser(){
        return userDAO.showUser();
    }
    
    public void updateUser(User u){
        userDAO.updateUser(u);
    }
     
    public void deleteUser(int id){
        userDAO.deleteUser(id);
    }
     
    public void checkUsername(String username) throws UserAlreadyCreatedException{
         for (User user : getUser()) 
             if(user.getUsername().equals(username))
                 throw new UserAlreadyCreatedException();
    }
     
    public void setCurrentUser(String username, String password) throws LoginException{
         for (User user : getUser()) {
             if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                 currentUser = user;
                 return;
             }
         }
         
         throw new LoginException();
    }
     
    public static User getCurrentUser(){
         return currentUser;
    }
     
    public void setNull(){
         currentUser = null;
    }
}
