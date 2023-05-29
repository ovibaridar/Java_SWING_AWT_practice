
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
public class uri1134 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
       int  Alcool =0;
       int  Gasolina =0;
       int Diesel = 0;
        while((a=in.nextInt())!=4){
            if(a==1){
             Alcool ++;   
            }
            if(a==2){
             Gasolina ++;   
            }
            if(a==3){
             Diesel ++;   
            }
            
            
        }
        System.out.println("MUITO OBRIGADO\n"+"Alcool: "+Alcool+"\nGasolina: "+Gasolina
        +"\nDiesel: "+Diesel);
    }
}
