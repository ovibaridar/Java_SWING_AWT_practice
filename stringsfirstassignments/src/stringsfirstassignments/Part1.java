package stringsfirstassignments;

/**
 *
 * @author oviba
 * TAAATG  AAA  TAAATGTAA
 * TAA
 *ATGAAATAA
 */
public class Part1 {
    public String  findthesimplegene (String DNA){
   
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
                      return DNA2.substring(0,position2+3);
            }
            else
                return "";
           
           
        }
        else
        {
            return "";
        }
       
    }
     
 return "";
}
    public  void testSimpleGene()
    {
        String gene ="";
        Part1 obj = new Part1();
        String DNA4  ="TAAAAATAATAA";//ATG with out 
        System.out.println("DNA1  string "+DNA4);
        gene=findthesimplegene(DNA4);
        System.out.println("GENE1 string "+gene);
        String DNA5  ="GATGAAATGAAT";//TAA with out 
        System.out.println("DNA2  string "+DNA5);
        gene=findthesimplegene(DNA5);
        System.out.println("GENE2 string "+gene);
        String DNA6  ="GTATGAGTATAAAAA";//ATG TAA with out 
        System.out.println("DNA3  string "+DNA6);
        gene=findthesimplegene(DNA6);
        System.out.println("GENE3 string "+gene);
        
        String DNA7  ="ATGATGAAATAATAA"; //with ATG and TAA  multiple by 3 sub string 
        System.out.println("DNA4  string "+DNA7);
        gene=findthesimplegene(DNA7);
        System.out.println("GENE4 string "+gene);
       
        String DNA8  ="ATGTATAA";//with ATG and TAA  multiple by not 3 sub string 
        System.out.println("DNA5  string "+DNA8);
        gene=findthesimplegene(DNA8);
        System.out.println("GENE5 string "+gene);
    }
    public static void main (String [] args )
    {
       Part1 obj = new Part1();
       System.out.println(obj.findthesimplegene("TAAATGAAATAAATGTAA"));
       obj. testSimpleGene();
       
    }
    
}
