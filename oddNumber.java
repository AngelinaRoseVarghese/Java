package lab2;
import java.util.Scanner;
public class oddNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int count=sc.nextInt();
		for(int i=1;i<count;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			else
			{
				continue;
			}
		}
	}
}
		
