
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oviba
 */
public class t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n;
        int b=0;
        System.out.println("enter a num");
        n =in.nextInt();
       for(i=2;i<=9;i++)
       {
           if((n+1)%i==0)
           {
               System.out.println("the num is sunny");
               System.out.println("And it's divided by ");
               System.out.println(i);
               b++;
               break;
               
           }
           
       }
       if(b==0)
        System.out.println("NOT");
    }
    
}
