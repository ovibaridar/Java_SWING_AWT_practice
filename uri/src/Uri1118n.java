
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
public class Uri1118n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float a;
        int x =0;
        float b =0;
        while(true){
            a =in.nextFloat();
            if(a==2){
                break;
            }
            else  if(a>10 || a<0){
                System.out.println("nota invalida");
            }
            else if(x==0){
                b =a;
                x ++;
            }
            else if(a>0 || a<10){
                
                System.out.printf("media %.2f\n",(a+b)/2);
                System.out.println("1 for start again 2 for closed");
                x = 0;
            }
            
        }
     
    }
}
