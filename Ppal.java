import java.util.Scanner;

public class Ppal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ss =input.nextLine();
        //int v =ss.length()-1;
        String r ="";
        for(int i=ss.length()-1;i>=0;i--)
        {
            r+=ss.charAt(i);
        }
        if(r.equals(ss))
        {
            System.out.println("This is a palindrom");
        }
        else
        {
            System.out.println("This is not a palindrom");

        }
    }
}