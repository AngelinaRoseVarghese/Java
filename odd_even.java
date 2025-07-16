package lab2;
import java.util.Scanner;
public class odd_even
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is odd or even: ");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("The number is even");
		}
		else if(num==0)
		{
			System.out.println("The number is zero");
		}
		else
		{
			System.out.println("The number is odd");
		}	
	}

}
