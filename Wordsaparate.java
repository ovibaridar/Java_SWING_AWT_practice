import java.util.Scanner;

public class Wordsaparate{
    public static void main(String  args []) {
        Scanner  m = new Scanner(System.in);

        String s;

        s =m.nextLine();

       

        String [] a =s.split("\\s");

        for(int i =0;i<s.length();i++)
        {
           System.out.println(a[i]);
           
           
        }
           //System.out.println(+b);
    }

}