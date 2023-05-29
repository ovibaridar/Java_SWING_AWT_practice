import java.util.Scanner;

public class Chh
{
    public static void main(String[] arg) {
        Scanner a = new Scanner(System.in);
        char c [] ;
        c =new char[5];
        for(int i=0;i<5;i++)
        {
        c[i]=a.next().charAt(0);
        }
   String s1 = new String(c);
   System.out.println(s1);
    }
}