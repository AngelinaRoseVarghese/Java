package lab3;
import java.util.Scanner;
class PaymentGateway
{
	public void makePayment(String cardNumber, String expiryDate, String cvv)
	{
		System.out.println("The payment is done by credit card");
		System.out.println("Payment Successful");
	}
	public void makePayment(String upid)
	{
		System.out.println("The payment is done by upi");
		System.out.println("Payment Successful");

	}
	public void makePayment(double amount)
	{
		System.out.println("The payment is done by cash on delivery");
		System.out.println("Payment Successful");

	}
}
public class ECommerceApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How you wish to do this transaction: ");
		System.out.println("1.Credit Card");
		System.out.println("2.Upi");
		System.out.println("3.Cash on delivery");
		int choice=sc.nextInt();
		PaymentGateway payment1=new PaymentGateway();
		switch(choice)
		{
			case 1:
				payment1.makePayment("10203040","22/04/2025","88974");
				break;
			
			case 2:
				payment1.makePayment("15697873");
				break;
				
			case 3:
				payment1.makePayment(15506.23);
				break;

		}
		
		
	}

}


