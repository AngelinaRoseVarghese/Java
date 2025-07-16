package lab2;
import java.util.Scanner;
public class NNaturalNumber
{
	public static void main(String[] args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit=sc.nextInt();
		for(i=0;i<=limit;i++)
		{
			System.out.println(i);
		}
	}
}
