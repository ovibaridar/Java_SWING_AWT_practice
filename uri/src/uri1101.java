
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
public class uri1101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        
         while(((a = in.nextInt()) > 0 )&&((b = in.nextInt()) > 0 )){
            int sum = 0;
            
           
            if(a>b){
                for(int i = b;i<=a;i++){
                    System.out.print(i+" ");
                    
                    sum=sum+i;
                }
            }
            System.out.print("Sum="+sum);
            System.out.println();
        }
        
    }
    
}

