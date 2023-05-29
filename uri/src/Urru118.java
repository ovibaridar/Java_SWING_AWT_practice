
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
public class Urru118 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b=0,c=0;
        while(true){
            a =in.nextFloat();
            if(a>10 || a<0){
                System.out.println("nota invalida");
            }
            else   if(c==0){
                b=a;
                c++;
            }
            else{
                float aa = (float)(a+b)/2;
                System.out.printf("media = %.2f\n",aa);
                c=0;
                break;    
            }
        }
        while(true){
            System.out.println("novo calculo (1-sim 2-nao)");  
            int x =in.nextInt();
            if(x==1){
              
        while(true){
            a =in.nextFloat();
            if(a>10 || a<0){
                System.out.println("nota invalida");
            }
            else   if(c==0){
                b=a;
                c++;
            }
            else{
                float aa = (float)(a+b)/2;
                System.out.printf("media = %.2f\n",aa);
                c=0;
                break;    
            }
        }
            }
            else if(x==2){
                break;
            }          
    }
}
    
}
