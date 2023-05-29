
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
public class URI1118 {
        public static void main(String[] args) {
        
    
       Scanner in = new Scanner(System.in);
       float a,b=0,c=0;
       int x =0,y=0,z;
       
 
        while(x!=2)  {
       while(y!=2){
              a =in.nextFloat();
              if(a>10 || a<0){
                System.out.println("nota invalida");
            }
            else if(c==0){
                b=a;
                c++;
                y++;
            }
            else if(a>0 || b>0){
                float aa = (float)(a+b)/2;
                System.out.printf("media = %.2f\n",aa);
               
                c=0;
                a=0;
                b=0;
                aa = 0;
                y++;
               
            }
                     
            }
        x=in.nextInt();
        
        if(x==1){
        System.out.println("novo calculo (1-sim 2-nao)");
        }
       }
}
}

