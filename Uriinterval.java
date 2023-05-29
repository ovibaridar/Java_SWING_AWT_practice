import java.util.Scanner;
public class Uriinterval{
public static void main(String [] args)
{
	Scanner input = new Scanner (System.in);
	int n =input.nextInt();
	int [] a = new int[n];
	int i;
	int y =0;
	int m =0;
	for(i=0;i<n;i++)
	{
		a[i] = input.nextInt();
	}
	for(i=0;i<n;i++)
	{
		if(a[i]>=10 && 20>=a[i])
		{
			y++;
		}
		else {
			m++;
		}
	}
	System.out.println(y+" in");
	System.out.println(m+" out");
	
}
}