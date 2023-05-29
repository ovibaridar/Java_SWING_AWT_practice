/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ovi
 */
public class Phone {

    public static void main(String[] args) {
        // TODO code application logic here
        String nam;
        String num;
        String ad;
        String ag;
        String gen;
        int n;
        String sea ;
         Collection<String> aa = new ArrayList<>();
      
        Scanner in = new Scanner (System.in);
        Scanner inm = new Scanner (System.in);
        System.out.println("\t\t\t\t\t...................................");
        System.out.println("\t\t\t\t\t...................................");
        System.out.println("\t\t\t\t\t\tWellcome a Phone Diry");
        System.out.println("\t\t\t\t\t...................................");
        System.out.println("\t\t\t\t\t...................................");
         
        System.out.println();
        System.out.println();
        System.out.println();
        do
        {
        System.out.println("\t\t\t\t\t\t\tMenu");
        System.out.println("\t\t\t\t\t...................................");
        System.out.println("\t\t\t\t\t1) Add Record");
        System.out.println("\t\t\t\t\t2) Display");
        System.out.println("\t\t\t\t\t3) Scearch");
        System.out.println("\t\t\t\t\t4) Delete");
        System.out.println("\t\t\t\t\t5) Exet");
        
         n =in.nextInt();
     
           
       
           switch(n)
        {
            case 1:
                System.out.print("\t\t\t\t\tEnter your name : ");
                nam =inm.nextLine();
                System.out.println();
                System.out.print("\t\t\t\t\tEnter your number : ");
                num =inm.nextLine();
                System.out.println();
                System.out.print("\t\t\t\t\tEnter your address : ");
                ad =inm.nextLine();
                System.out.println();
                System.out.print("\t\t\t\t\tEnter your age : ");
                ag =inm.nextLine();
                System.out.println();
                System.out.print("\t\t\t\t\tEnter your Gender : ");
                gen =inm.nextLine();
                System.out.println();
                aa.add(nam);
                aa.add(num);
                aa.add(ad);
                aa.add(ag);
                aa.add(gen);
                break; 
                
            case 2:
            
                System.out.println("\t\t\t\t\t...................................");
                Iterator<String>itr=aa.iterator();
                while(itr.hasNext())
                {
                    System.out.println(itr.next());
                    
                }
                if(aa.size() == 0) 
                        System.out.println("No Data Here");
                System.out.println("\t\t\t\t..................................."); 
                break;
            
            case 3:
                
                System.out.println("Enter the number You Want to Search");
               
                sea=inm.nextLine();
                
                itr=aa.iterator();
                
                while(itr.hasNext())
                {
                    
                    if( aa.contains(sea))
                        
                    System.out.println(itr.next());
                    
                }
                break;
                
                
        }
       
      }while(n!=15);
        
    }
}
   

