
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
public class ur1146 {
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        int x;
        int y=0;
        do{
            x=in.nextInt();
           for(int i=1;i<=x;i++){
               if(i!=(x))System.out.printf(i+" ");
               if(i==(x))System.out.print(i);
               y++;
               if(y==x){
                   System.out.println();
                   y=0;
               }
           }

        }while(x!=0);

    }
}
