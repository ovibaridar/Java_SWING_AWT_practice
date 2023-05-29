
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ovi
 */
public class Libararym {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inm = new Scanner(System.in);
         Scanner pa = new Scanner(System.in);
        
         int is;
         String bo;
         String an;
         String ed;
         String Wr;
         String pu;
         
         String sname;
         int stid;
         String bname;
         String depname;
         int sphone;
         String isudate;
         String subdate;
         String review;
         
         Set<Asol> st =  new HashSet<>();
         Set<Stdudentsinfo> stf =  new HashSet<>();
         
         
         
         
         
         
        System.out.println("\t\t\t\t.............................................................. ");
        System.out.println("\t\t\t\t.............................................................. ");
        System.out.println("\t\t\t\t\tPundra University of Science & Technology");
        System.out.println("\n\t\t\t\t\t\t\tLibrary");
        System.out.println("\t\t\t\t.............................................................. ");
        System.out.println("\t\t\t\t.............................................................. ");
        
        int n;
        do{
            
        
        System.out.println("\t\t\t\t\t\t\tMenu");
        System.out.println("\t\t\t\t\t...................................");
        System.out.println("\t\t\t\t\t1) Add Book Record");
        System.out.println("\t\t\t\t\t2) Display All Book");
        System.out.println("\t\t\t\t\t3) Scearch A Book");
        System.out.println("\t\t\t\t\t4) Delete A Book");
        
        System.out.println("\t\t\t\t\t5) Isu Book");
        System.out.println("\t\t\t\t\t6) Show All Isu Information");
        System.out.println("\t\t\t\t\t7) Search Isu Book");
        System.out.println("\t\t\t\t\t8) Remove Isu Book");
        
        System.out.println("\t\t\t\t\t9) Exet");
        System.out.print("Enter Your Choice");
        n=in.nextInt();    
            
               
        switch(n){
        case 1:
        System.out.print("\nEnter The Book ISBM Number = ");
        is=in.nextInt();
        System.out.print("Enter The Book Name = ");
        bo =inm.nextLine();
        System.out.print("Enter The Book Another Name = ");
        an =inm.nextLine();
        System.out.print("Enter The Book Edition = ");
        ed =inm.nextLine();
        System.out.print("Enter The Book Writter Name = ");
        Wr =inm.nextLine();
        System.out.print("Enter The Book Publication = ");
        pu =inm.nextLine();
       
        st.add(new Asol(is,bo,an,ed,Wr,pu));
        break;      
                      
        case 2 :
        
        Iterator<Asol> it =st.iterator(); 
        while(it.hasNext())
                {
                        
                    System.out.println(it.next());
                    
                }
        if(st.isEmpty())
        {
         System.out.println("Sorry No Data for Swoing");
        }
            
        break;
        case 3:
            boolean f =false;
            System.out.println("Enter the Book Name = ");
            String fou =inm.nextLine();
            it =st.iterator();  
            while(it.hasNext())
                {
                    Asol e =it.next();
                    if(e.get().equals(fou)){
                    System.out.println(e);
                    f =true;
                    }
                }
            if(!f)
            {
                System.out.println("Not found");
            }
            break;
        
        case 4:
            boolean ff =false;
            System.out.println("Enter the Book Name = ");
            String foui =inm.nextLine();
            it =st.iterator();  
            while(it.hasNext())
                {
                    Asol e =it.next();
                    if(e.get().equals(foui)){
                    it.remove();
                        System.out.println("Sussesfully Deleted ");
                    ff =true;
                    }
                }
            if(!ff)
            {
                System.out.println("Not found");
            }
            break;
         case 5:
        System.out.print("\nEnter The Student  Name = ");
        sname=inm.nextLine();
        System.out.print("\nEnter The Student Id = ");
        stid =inm.nextInt();
        
        System.out.print("\nEnter The Book  Name = ");
        bname =inm.nextLine();
        
        System.out.print("\nEnter The Department Name = ");
        depname =inm.nextLine();
        
        System.out.print("\nEnter The Student Phone Number = ");
        sphone =inm.nextInt();
        
        System.out.print("\nEnter  Book Isu Date = ");
        isudate =inm.nextLine();
        
        System.out.print("\nEnter  Book Submission Date = ");
        subdate =inm.nextLine();
        
        System.out.print("\nPlease Give Us Review = ");
        review =inm.nextLine();
        stf.add(new Stdudentsinfo(sname,stid,bname,depname,sphone,isudate,subdate,review));
         break;
         case 6:
             Iterator<Stdudentsinfo> itt =stf.iterator(); 
        while(itt.hasNext())
                {
                    
                    
                        
                    System.out.println(itt.next());
                    
                }
        if(st.isEmpty())
        {
         System.out.println("Sorry No Data for Swoing");
        }
        break;
         case 7:
             
             boolean ha =false;
            System.out.println("Enter the Student Id = ");
            int foue;
            foue =inm.nextInt();
            itt =stf.iterator();  
            while(itt.hasNext())
                {
                    Stdudentsinfo j =itt.next();
                    if(j.gett()==foue){
                    System.out.println(j);
                    ha =true;
                    }
                }
            if(!ha)
            {
                System.out.println("Not found");
            }
            break;
            
         case 8:
            boolean haa =false;
            System.out.println("Enter the Student Id = ");
            int fouea;
            fouea =inm.nextInt();
            itt =stf.iterator();  
            while(itt.hasNext())
                {
                    Stdudentsinfo j =itt.next();
                    if(j.gett()==fouea){
                    System.out.println(j);
                    haa =true;
                    }
                }
            if(!haa)
            {
                System.out.println("Not found");
            }
            break;
            
        }  
         
        
    }while(n!=9);
        System.out.println();
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tCreated By Al Arman Ovi");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t    CSE Depertmaent");
    }
}
    
    

