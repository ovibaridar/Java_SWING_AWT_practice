/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovi;

/**
 *
 * @author Ovi
 */
public class objkety {
    String username ;
    String password;
    String pet;
    public objkety(String username ,String password,String pet){
        this.username =username;
        this.password = password;
        this.pet = pet ;
    }
    
     @Override
    public String toString(){
        return "Username = "+username+"password = "+"Pet Name = "+pet;
    }      
        public String get(){
            
        return  pet;
            
        }
        public String getu(){
            
        return  username;
            
        }
        public String getp(){
            
        return  password;
            
        }
        
    
}

