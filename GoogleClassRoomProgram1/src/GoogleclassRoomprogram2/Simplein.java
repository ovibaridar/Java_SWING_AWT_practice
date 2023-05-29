/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleclassRoomprogram2;

/**
 *
 * @author Ovi
 */
public class Simplein {
    public static void main(String[] args) {
        
    
   A superOb=new A();
   B subOb= new B();
   superOb.i = 10;
   superOb.j = 10;
        System.out.println("Contens of superOb = ");
        superOb.showij();
        System.out.println("Sum of i,j in superbob : ");
        superOb.showsij();
        System.out.println();
        
        subOb.i=15;
        subOb.j=51;
        subOb.k=20;
        System.out.println("Contens of subOb = ");
        subOb.showij();
        subOb.showk();
        
        System.out.println();
        
        System.out.println("Sum of i,j,k in subob : ");
        subOb.shows();
    }
    
}
