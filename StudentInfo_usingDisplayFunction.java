package lab2;
import java.util.Scanner;
class Kid
{
	String name;
	int age;
	public void StudentDetails()
	{
		System.out.println(name);
		System.out.println(age);
	}
}
public class StudentClassIntialised
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			Kid S1=new Kid();
				System.out.println("Enter the name: ");
				S1.name=sc.nextLine();
				System.out.println("Enter the age: ");
				S1.age=sc.nextInt();
				S1.StudentDetails();
		}
	}
	


