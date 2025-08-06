package lab4;
import java.util.Scanner;
class student
{
	String name;
	static int studentCount=0;
	student(String name)
	{
		this.name=name;
		studentCount++;
	}
	public static int getStudentCount()
	{
		return studentCount;
	}
}
public class StudentNameCount 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of first student: ");
		String detail1=sc.nextLine();
		student student1=new student(detail1);
		student1.getStudentCount();
		
		System.out.println("Enter the name of second student: ");
		String detail2=sc.nextLine();
		student student2=new student(detail2);
		student2.getStudentCount();
		
		
		System.out.println("Enter the name of thrid student: ");
		String detail3=sc.nextLine();
		student student3=new student(detail3);
		System.out.println("The count of student: "+ student2.getStudentCount());
	}

}
