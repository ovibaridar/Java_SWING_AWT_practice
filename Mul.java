import java.util.Scanner;
public class Mul{
	public  static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.printf("%d x %d = %d\n",i,n,i*n);
		}
	}
}