
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
public class uri1145 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x =in.nextInt();
        int y =in.nextInt();
        int b=0;
        if(x<y &&y<100000){
            for(int i=1;i<=y;i++){
                b++;
                System.out.print(i+" ");
                   
                if(b==x){
                    System.out.println();
                    b=0;
                }
                    
            }
        } 
    }
    
}
