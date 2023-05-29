import java.util.Scanner;
public class Twoe{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i;
		for(i=1;i<1000;i++)
		{
		
			if(i%n==2)
				System.out.printf("%d\n",i);
				
		}
	}
	
}