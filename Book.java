package lab3;
class BookDetails
{
	String title;
	String author;
	double price;
	int quantity;
	double totalValue;
	BookDetails(String title,String author,double price,int quantity)
	{
		this.title=title;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	public void totalValue()
	{
		totalValue=price*quantity;
		System.out.println("The total value of the book is: "+totalValue);
	}
	public void display()
	{
		System.out.println("Title of the book: "+title);
		System.out.println("Author of the book: "+author);
		System.out.println("Price of the book: "+price);
		System.out.println("Quantity of the book: "+quantity);
	}
}

public class Book 
{
	public static void main(String[] args) 
	{
		BookDetails book1=new BookDetails("Romeo & Juliet","William Shakspere",360.0,25);
		book1.display();
		book1.totalValue();
		BookDetails book2=new BookDetails("Alchemist","Paolo Colilo",450.0,15);
		book2.display();
		book2.totalValue();

	}

}
