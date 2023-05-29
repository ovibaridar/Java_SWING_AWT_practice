/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awing;

import java.util.Scanner;

/**
 *
 * @author Ovi
 */
public class findc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1st  name ");
        String pleate1 =in.nextLine();
        System.out.println("2st  name ");
        String pleate2 =in.nextLine();
        System.out.println("Age");
        String pleate3 =in.nextLine();
        System.out.println("Age");
        String pleate4 =in.nextLine();
        int a =Integer.parseInt(pleate3);
        int b =Integer.parseInt(pleate4);
        int c =pleate1.length();
        int d =pleate2.length();
        System.out.println("1st name Length "+c);
        System.out.println("2nd name Length "+d);
        System.out.println("1st age convert to  integer "+a);
        System.out.println("2nd age convert to  integer "+b);
        int sumname =c*a;
        int sumage = b*d;
        float dividing =(float) ((sumname+sumage)/(2.5));
        if( dividing<=50){
            float bw =(dividing+(50-(c+d+1)));
          System.out.println(bw);  
        }
        else if(dividing>100){
        dividing =100; 
        if(a+b<20){
        float main=dividing-((a+b)/2);
        System.out.println(main);
        }
        
        else{
            
            float main=dividing-((a+b)/3);
           System.out.println(main); 
        }
        
        }
        else if( 60<dividing && dividing<70 ){
            System.out.println((dividing+25)); 
        }
        
        else if( 50<dividing && dividing<60 ){
            System.out.println((dividing+20)); 
        }
        
        else{
           System.out.println(dividing);  
        }
        
        
    }
    
}
