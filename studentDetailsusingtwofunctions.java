package lab2;
import java.util.Scanner;
class Student
{
	String name;
	int age;
	public void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the age: ");
		age=sc.nextInt();
	}
	public void printDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The name of the student is " + name);
		System.out.println("The age of the student is " + age);
	}
}
public class StudentClass
{
	public static void main(String[] args)
	{
			Student S1=new Student();
			S1.getDetails();
			S1.printDetails();
	}
}


