
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
public class uri1099 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int  i,a,b;
        
        for(i=1;i<=n;i++){
            int sum = 0;
            a=in.nextInt();
            b=in.nextInt();
            if(a<b){
                for(int j=a;j<b;j++){
                    if(j!=a)
                    if(j%2!=0){
                        sum =sum+j;
                    }
                }
            }
            if(a>b){
                for(int j=b;j<a;j++){
                    if(j!=b)
                    if(j%2!=0){
                        sum =sum+j;
                    }
                }
            }
            System.out.println(sum);   
        }
    }
    
}
