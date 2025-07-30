package lab3;
import java.util.Scanner;
class Student
{
	String name;
	int roll;
	int mark1,mark2,mark3;
	float average;
	Student(String name,int roll,int mark1,int mark2,int mark3)
	{                  
		this.name=name;
		this.roll=roll;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3; 
	}

	public void average()
	{
		average=(mark1+mark2+mark3)/3;
		System.out.println("The average mark: "+average);
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);  
		System.out.println("Mark1: "+mark1);  
		System.out.println("Mark2: "+mark2);
		System.out.println("Mark3: "+mark3);  
	}
}
public class StudentDemo
{

	public static void main(String[] args)
	{
		Student student1= new Student("Angelina",23,28,26,20);
		student1.display();
		student1.average();

		   
		Student student2=new Student("Maya",63,29,28,30);
		  
        student2.display();  
        student2.average();
	}

}