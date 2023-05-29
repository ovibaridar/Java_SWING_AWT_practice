/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ovi
 */
public class A extends Thread{
   
    @Override
    public void run(){
        for(int i=2;i<=10;i=i+2){
            System.out.println(i);  
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
