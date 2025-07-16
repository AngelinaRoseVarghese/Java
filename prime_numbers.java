package lab2;
import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String[] args)
	{
		int i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		for(i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=0;
				break;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("the number is not a prime: ");
		}
		else
		{
			System.out.println("the number is a prime: ");
		}
	}
}
