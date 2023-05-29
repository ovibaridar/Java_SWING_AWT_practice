
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
public class uri1149 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int x,n;
       int b=0;
       x=in.nextInt();
      while(true){
          n=in.nextInt();
          if(n>0)
          {
              b=1;
          }
          if(b==1){
              break;
          }
      }
      int sum =0;
        for(int i=1;i<=n;i++){
            sum=sum+x;
            x++;
        }
        System.out.println(sum);
    }
}
