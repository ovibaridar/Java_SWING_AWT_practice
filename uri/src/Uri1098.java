
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
public class Uri1098 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float i ,j,jj,jjj;
        i =0;
        j=1;
        jj=2;
        jjj=3;
        while(i<2.1){
            System.out.printf("I="+i);
            System.out.printf("  j=%.1f",j+i);
            System.out.println();
            System.out.print("I="+i);
            System.out.printf("  j=%.1f\n",jj+i);
            System.out.println();
            System.out.printf("I="+i);
            System.out.printf("  j=%.1f",jjj+i);
            System.out.println();
            i+=.2;
        }
        
    }
    
}
