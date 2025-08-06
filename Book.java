package lab4;
import java.util.Scanner;
class book
{
	String title;
	String author;
	final int bookid;
	static int bookCounter=1000;
	static final String library_name="Central library";
	book()
	{
		title="Harry Potter: Deathly Hallows";
		author="J.K Rowling";
		bookid=bookCounter++;
		System.out.println(" ");
	}
	book(String title,String author)
	{
		this.title=title;
		this.author=author;
		bookid=bookCounter++;
	}
	public void displayInfo()
	{
		System.out.println("TITLE: "+ title);
		System.out.println("AUTHOR: "+author);
		System.out.println("ID: "+bookid);
		System.out.println(" ");
	}
	public void displayInfo(boolean showlibrary)
	{
		displayInfo();
		if(showlibrary==true)
		{
			System.out.println("Name of the library: " + library_name);
		}
	}
	public static void displayTotalBooks()
	{
		System.out.println("Total book:"+ (bookCounter-1000));
		
	}
}
public class Book 
{

	public static void main(String[] args)
	{
		book book1=new book();
		book1.displayInfo(true);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of first book: ");
		String title1=sc.nextLine();
		System.out.println("Enter the author of first book: ");
		String name1=sc.nextLine();
		book book2=new book(title1,name1);
		book2.displayInfo(true);
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the name of second book: ");
		String title2=sc2.nextLine();
		System.out.println("Enter the author of second book: ");
		String name2=sc2.nextLine();
		book book3=new book(title1,name1);
		book3.displayInfo();
		book3.displayTotalBooks();
		
	}
}

