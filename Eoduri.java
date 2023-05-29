import java.util.Scanner;
public class Eoduri{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		int n  = input.nextInt();
		int [] a =new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i] = input.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				if(a[i]%2==0)
					System.out.println("EVEN POSITIVE");
				else
					System.out.println("ODD POSITIVE");
			}
			else if(a[i]<0)
			{
				if(a[i]%2==0)
					System.out.println("EVEN NEGATIVE");
				else
					System.out.println("ODD NEGATIVE");
			}
			else 
				System.out.println("NULL");
				
			
		}
	}
}