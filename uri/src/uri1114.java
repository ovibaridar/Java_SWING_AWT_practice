
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
public class uri1114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pass = 2002;
        int inpass;
        while((inpass=in.nextInt())!=pass)
        {
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
    }
}
