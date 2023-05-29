
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
public class kkl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int z=0;
        int b;
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
       int  cou = 0;
       for(int i = c ;i<=b;i=i+2){
           int sum =0;
            if((i+1)<=b){
           sum =i+(i+1);}
            if(sum>=b){
                cou++;
            }
       }
        System.out.println(cou);
    }
    
}
