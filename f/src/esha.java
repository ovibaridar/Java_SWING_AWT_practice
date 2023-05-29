
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
public class esha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n,i ;
        System.out.println("Enter The Size Of Array");
        n=in.nextInt();
        int  a[] = new int[n];
        System.out.println("Enter The Number Of Array");
        for(i=0;i<n;i++){
            a[i] =in.nextInt();
        }
        int sum =0;
        for(i=0;i<n;i++){
            sum+=a[i];
        }
        
        
    boolean flag = false;
    for ( i = 2; i <= sum / 2; ++i) {
      // condition for nonprime number
      if (sum % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println("YES");
    else
      System.out.println("No");
        
        
    }
}
