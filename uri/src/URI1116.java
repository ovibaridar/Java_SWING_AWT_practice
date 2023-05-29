
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
public class URI1116 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n;
        n=in.nextInt();
        
        for(i=1;i<=n;i++){
            int a = in.nextInt();
            int b =in.nextInt();
            if(b==0){
                System.out.println("divisao impossivel");
            }
            else{
                float s; 
                s=(float)a/b;
                System.out.printf("%.1f\n",s);
            }
            
        }
    }
}
