
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ovi
 */
public class Mysq {
    public static void main(String[] args) {
        Set<Students> st =  new HashSet<>();
        Scanner in = new Scanner(System.in);
        String n=in.nextLine();
        int a = in.nextInt();
        st.add(new Students(n,a));
        
       Iterator<Students> it =st.iterator();
               
                      
              
        while(it.hasNext())
                {
                    
                    
                        
                    System.out.println(it.next());
                    
                }
    }
    
}
