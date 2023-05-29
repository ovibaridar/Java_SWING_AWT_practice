import java.util.Scanner;
public class Evenuri{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);
		int a =input.nextInt();
		int i;
		for(i=0;i<=a;i=i+2)
		{
			if(i>0)
			{
				System.out.printf("%d^2 = %d\n",i,(i*i));
			}	
		}
		
	}
}