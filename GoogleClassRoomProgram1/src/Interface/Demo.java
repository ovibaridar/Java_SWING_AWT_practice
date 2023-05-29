/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author Ovi
 */
public class Demo {
    public static void main(String args[]) {
 
     A.NestedIF nif = new B();
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        
    if(nif.isNotNegative(b)){
    System.out.println(b+" is not negative");}
    else if(nif.ispsitive(b)){    
    System.out.println(b+" is Negative");}
 }
}
