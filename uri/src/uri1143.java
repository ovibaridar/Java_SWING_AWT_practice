
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
public class uri1143 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int x =1;
        int c=0;
        int v=0;
        int a=in.nextInt();
        for(i=1;i<=a;i++){
             c =(x*x);
             v =x*c;
            
            System.out.println(x+" "+c+" "+v);
            System.out.println(x+" "+(c+1)+" "+(v+1));
            x=x+1;
        }
    }
}
