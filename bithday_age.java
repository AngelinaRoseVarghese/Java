package lab1;
import java.util.Scanner;
public class  BithdayAge
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your birthday date: ");
		int day=sc.nextInt();
		System.out.println("Enter your birthday month: ");
		int month=sc.nextInt();
		System.out.println("Enter your birthday year: ");
		int year=sc.nextInt();
		System.out.println("Hi, Angelina! your birthday is at " +day +"/" +month +"/" +year  +", Happy Birthday!" ); 
		int age=2025-year;
		System.out.println("You will become " +age +" at your birthday");
	}
}
