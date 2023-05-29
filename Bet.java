import java.util.Scanner;
public class Bet{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);
		int n,m;
		n=input.nextInt();
		m=input.nextInt();
		int [] ar = new int[n];
		int [] arr = new  int[m];
		for(int i =0;i<n;i++)
		{
			ar[i] = input.nextInt();
		}
		
		for(int j =0;j<m;j++)
		{
			arr[j] = input.nextInt();
		}
		
		
		
	}
}