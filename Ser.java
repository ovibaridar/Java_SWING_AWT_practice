import java.util.Scanner;
public class Ser{
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);


        String ch ;
        System.out.println("Enter a String");
        ch = input.nextLine();
        System.out.println("Enter a Number postion of charactor you want to see ");
        int a =input.nextInt();
        int b = ch.length();
        if(a<=b){
        char c =ch.charAt(a-1);
       System.out.println(c);
        }
        else
        {
            System.out.println("Sorry Your Input is out of length");
        }
    }
}