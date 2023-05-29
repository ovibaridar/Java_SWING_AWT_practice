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
public class Sum extends Abs{
    Sum(int a, int b){
        super (a,b);
       }
    
     @Override
    void result(){
        int aa= a+b;
        System.out.println("Sum = " + aa);
    }
    
}