
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
public class uri1142 {
    public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int i ;
        int x =1;
        int y =2;
        int z =3;
        for (i=1;i<=a;i++){
            System.out.println(x+" "+y+" "+z+" PUM");
            x=x+4;
            y=y+4;
            z=z+4;
        }
    }
}
