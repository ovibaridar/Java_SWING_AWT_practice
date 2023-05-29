
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
public class t2003 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int [] a;
        a=new int[10];
        int i,n;
        for(i=0;i<5;i++)
        {
            a[i] =in.nextInt();
        }
        System.out.println("Which element u want to remove ");
        n =in.nextInt();
        
        for(i=0;i<5;i++)
        {
            if(a[i]==n)
            {
                continue;
            }
            System.out.println(a[i]);
        }
    }
    
}
