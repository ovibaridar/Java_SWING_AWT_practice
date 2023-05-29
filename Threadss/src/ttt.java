/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ovi
 */
public class ttt {
    public static void main(String[] args) {
        Myt obj = new Myt();
        Myt2 ob = new Myt2();
        Thread t1 = new Thread(ob);
        
        obj.setName("ovi");
        obj.start();       
        t1.start();
        
    }
}
