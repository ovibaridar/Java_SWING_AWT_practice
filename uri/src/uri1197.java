
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
public class uri1197 {
    public static void main(String[] args) {
        
   int v, t , s, double_S;
		Scanner sc =new Scanner(System.in);
		int EOF = -1;
		while (((v =sc.nextInt() )!= EOF)) {
			t = sc.nextInt();
			s = v * t;
			double_S = s * 2;
			System.out.print(double_S+"\n");
		}
    }  
}



