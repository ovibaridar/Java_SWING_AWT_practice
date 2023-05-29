
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
public class uri1113 {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
    int a ,b;
    
            
    while((a= in.nextInt())!=( b = in.nextInt())){
        
        
       
        if(a>b){
            System.out.println("Decrescente");
        }
        else{
            System.out.println("Crescente");
        }
    }
    
    }
}
