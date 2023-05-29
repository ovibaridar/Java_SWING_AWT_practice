
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
public class uri1047 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int a, b, c, d;
    int dif;
    a =in.nextInt();
    b=in.nextInt();
    c =in.nextInt();
    d =in.nextInt();
    
    dif = ((b*60)+d) - ((a*60)+c);
    if(dif<=0) dif += 24*60;
    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", dif/60, dif%60);
    }
}
