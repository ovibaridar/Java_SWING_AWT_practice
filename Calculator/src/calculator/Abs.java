/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Ovi
 */
public abstract class Abs {
     int a, b;
     
     Abs(int a, int b){
         this.a = a;
         this.b = b;
     }
    
    abstract void result ();
}