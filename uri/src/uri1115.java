
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
public class uri1115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        while(((a = in.nextInt()) !=0 ) && ((b = in.nextInt()) != 0 )){
            
        
               if(a>0 && b>0)
               {
                   System.out.println("primeiro");
               }
               if(a<0 && b<0)
               {
                   System.out.println("terceiro");
               }
               if(a>0 && b<0)
               {
                   System.out.println("quarto");
               }
              
                       if(a<0 && b>0){
                   System.out.println("segundo");
            }
           
           
        }
    }
    
}
