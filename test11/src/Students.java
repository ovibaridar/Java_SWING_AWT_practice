/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ovi
 */
public class Students {
    String name;
    int roll ;
    public Students(String name ,int roll)
    {
       this.name=name;
       this.roll=roll;
    }
    
    @Override
   public String toString ()
   {
       return "Name : "+name+" Roll : " +roll;
   }
}
