/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googleclassroomprogram1;

/**
 *
 * @author Ovi
 */
public class DemoBoxWidth {
    public static void main(String[] args) {
        BoxWeight m1 =new  BoxWeight(10,20,15,34.3);
        BoxWeight m2 =new  BoxWeight(2,3,4,0.076);
        double vol;
        vol=m1.volume();
        System.out.println("Voume of M1 is "+vol);
        System.out.println("Weight  of M1 is "+m1.weight);
        System.out.println();
        
        vol=m2.volume();
        System.out.println("Voume of M1 is "+vol);
        System.out.println("Weight  of M1 is "+m2.weight);
        System.out.println();
        
    }
}
