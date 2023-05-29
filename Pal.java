public class Pal{
    public static void main(String[] args) {
       
        String r ="";
        for(int i=args.length-1;i>=0;i--)
        {
            r+=args.charAt(i);
        }
        if(r.equals(args))
        {
            System.out.println("This is a palindrom");
        }
        else
        {
            System.out.println("This is not a palindrom");

        }
    }
}