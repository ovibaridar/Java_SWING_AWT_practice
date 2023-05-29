/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsfirstassignments;

import java.io.PrintStream;

/**
 *
 * @author oviba
 */
public class Part2 {

    /**
     *
     * @param DNA
     * @return
     */
    public String  findthesimplegene (String DNA, String StartCodon, String StopCodon){
   
        if(DNA.contains("ATG"))
        {
            int position =DNA.indexOf("ATG");
            String DNA2= DNA.substring(position);
            if(DNA2.contains("TAA"))
            {
                int position2 =DNA2.indexOf("TAA");
                String DNA3 = DNA.substring(position, position2);
                int length =DNA3.length();
                //System.out.println(DNA3);
                if(length%3==0)
                {
                    String Dnaa = DNA2.substring(0,position2+3);
                      return Dnaa.toUpperCase();
            }
            else
                return "";
           
           
        }
       
    }
     
 return "";
}
    public  void testSimpleGene()
    {
        String gene ="";
        Part2 obj = new Part2();
        String DNA4  ="TAAATGAAATAAATGTAA";//ATG with out 
        String StartCodon = "ATG";
        String StopCodon = "TAA";
        System.out.println("DNA1  string "+DNA4);
        gene=findthesimplegene(DNA4,StartCodon,StopCodon);
        System.out.println("GENE1 string "+gene);
        
        String DNA5  ="GTAAATGAAATGAAT";//TAA with out 
         StartCodon = "ATG";
         StopCodon = "TAA";
        System.out.println("DNA2  string "+DNA5);
        gene=findthesimplegene(DNA5,StartCodon,StopCodon);
        System.out.println("GENE2 string "+gene);
        
        String DNA6  ="GTATGAGTATAAAAA";//ATG TAA with out
        StartCodon = "ATG";
        StopCodon = "TAA";
        System.out.println("DNA3  string "+DNA6);
        gene=findthesimplegene(DNA6,StartCodon,StopCodon);
        System.out.println("GENE3 string "+gene);
        
        String DNA7  ="ATGATGAAATAATAA"; //with ATG and TAA  multiple by 3 sub string 
        StartCodon = "ATG";
        StopCodon = "TAA";
        System.out.println("DNA4  string "+DNA7);
        gene=findthesimplegene(DNA7,StartCodon,StopCodon);
        System.out.println("GENE4 string "+gene);
       
        String DNA8  ="ATGGTATTATAA";//with ATG and TAA  multiple by not 3 sub string
        StartCodon = "ATG";
        StopCodon = "TAA";
        System.out.println("DNA5  string "+DNA8);
        gene=findthesimplegene(DNA8,StartCodon,StopCodon);
        System.out.println("GENE5 string "+gene);
    }
    public static void main (String [] args )
    {
       Part2 kll = new Part2();
       
        try {
            System.out.println(kll.findthesimplegene("taaatgaaataaatgtaa"));
        } catch (Exception e) {
        }
       kll.testSimpleGene();
    }

    private boolean findthesimplegene(String taaatgaaataaatgtaa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
  


    

