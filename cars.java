package lab5;
import java.util.Scanner;
public class cars
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to enter: ");
		int count=sc.nextInt();
		String [] Cars=new String[count];
		System.out.println("Enter the car names: ");
		for(int i=0;i<count;i++)
		{
			Cars[i]= sc.nextLine();
		}
		System.out.println("The Entered the car names are: ");
		for(int i=0;i<count;i++)
		{
			System.out.println(Cars[i]);
		}
	}
}
