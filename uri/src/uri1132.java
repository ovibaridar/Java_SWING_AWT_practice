
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
public class uri1132 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  a =in.nextInt();
        int  b =in.nextInt();
        int u;
        int sum =0;
        if(a<b){
        for(u=a;u<=b;u++){
            if(u%13!=0){
                sum =sum+u;
            }
        }
        System.out.println(sum);
        }
        else if(a>b){
        for(u=b;u<=a;u++){
            if(u%13!=0){
                sum =sum+u;
            }
        }
        System.out.println(sum);
        }
    }
    
}
