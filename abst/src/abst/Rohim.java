/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abst;

import java.util.Scanner;

/**
 *
 * @author Ovi
 */
public class Rohim extends Sd {
   int a;
    @Override
    void ssd(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is Your name ");
        a =in.nextInt();     
    } 
    void outa(){
        System.out.println(a);
    }
}
