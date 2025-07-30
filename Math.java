package lab3;
class operation
{
	public int calc(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	public int calc(int num1,int num2)
	{
		return num1-num2;
	}
	public int calc(int num1, int num2, int num3,int num4)
	{
		return num1*num2*num3*num4;
	}
}
public class Math 
{

	public static void main(String[] args) 
	{
		operation math1=new operation();
		System.out.println(math1.calc(10,20));
		System.out.println(math1.calc(1,2,3));
		System.out.println(math1.calc(2,2,3,3));
	}

}
