package lab5;
import java.util.Scanner;
public class CopyContentsOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to enter: ");
		int count=sc.nextInt();
		int num[]=new int [count];
		int num1[]=new int [count];
		System.out.println("Enter the elements: ");
		for(int i=0;i<count;i++)
		{
			num[i]=sc.nextInt();
			num1[i]=num[i];
		}
		System.out.println("The copied elements are: ");
		for(int i=0;i<count;i++)
		{
			System.out.println(num1[i]+"\t");
		}
		
	}

}
