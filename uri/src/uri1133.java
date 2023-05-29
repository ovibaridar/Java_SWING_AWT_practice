
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ovi
 */
public class uri1133 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int v = in.nextInt();
        int r;
        if(a<v){
           for(r =a+1 ;r<v;r++){
               if(r%5==2 || r%5==3){
                   System.out.println(r);
               }
           } 
        }
         if(a>v){
           for(r =v+1 ;r<a;r++){
               if(r%5==2 || r%5==3){
                   System.out.println(r);
               }
           } 
        }
    }
}
