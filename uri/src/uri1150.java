
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
public class uri1150 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int c = in.nextInt();
        int z=0;
        int b;
        int sum=0;
        int co=0;
        while(true){
             b=in.nextInt();
          if(b>c){
              z=1;
          }
          if(z==1)
          {
              break;
          }
        }
        for(int i=c;i<=b;i++){
            co++;
            sum=sum+i;
            if(sum>b) break;
            
        }
        System.out.println(co);
    }
}
