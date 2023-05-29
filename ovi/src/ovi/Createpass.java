/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



/**
 *
 * @author Ovi
 */
public class Createpass {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        Scanner stringg = new Scanner(System.in);
        Scanner intger = new Scanner(System.in);
        String pass;
        String username;
        String cpass;
        int pasi=0;
        String petname;
        String apass;
        int passchake=0;
        
        
        int opo =0;
        Set<objkety> st =  new HashSet<>();
        
        int a;
        while(true){
            
            System.out.println("1)Enter Yor password ");
            System.out.println("2)Create Yor password ");
            a =intger.nextInt();
            switch (a){
            case 2:
                while(true){
                    if(pasi==1){
                        System.out.println("You Alrady have a pass");
                        break;
                    }
                    if(pasi==0){
                System.out.println("Enter your User name");
                username=string.nextLine();
                System.out.println("Enter your Password");
                pass =string.nextLine();
                System.out.println("Confirm  Your password");
                apass =string.nextLine();
                System.out.println("Enter your Pet Name");
                petname=string.nextLine();
                if(pass.equals(apass)){
                st.add(new objkety (username,pass,petname));
                System.out.println("Add done");
                opo ++;
                pasi++;
                break ;
                }
                if(opo==0){
                    System.out.println("Password  was Not Match  ");
                }
                }
                }
                
            break;
            case 1:
                    if(st.isEmpty())
        {
         System.out.println("First Creat a password");
        }
                    if(st.isEmpty()==false){
            boolean f =false;
            System.out.printf("Enter the user name = ");
            String fou =string.nextLine();
           System.out.println();
            System.out.printf("Enter Your Password = ");
            String fouk =string.nextLine();
             System.out.println();
            Iterator<objkety> it =st.iterator();  
            while(it.hasNext())
                {
                   objkety e =it.next();
                    if(e.getu().equals(fou) | e.getp().equals(fouk)){
                    System.out.println("YEs");
                    
                    f =true;
                    passchake++;
                    break;

                    
                    }
                }
        
            if(!f)
            {
                System.out.println("Wrong Password");
            }
                    }
            break;
            
        }  
            if(passchake==1){
                break;
            }
        }
        
    }
    
}
