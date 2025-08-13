package lab5;
import java.util.Scanner;
public class MatrixTranspose 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered the no.of rows for matrix: ");
		int rows=sc.nextInt();
		System.out.println("Entered the no.of columns for matrix: ");
		int columns=sc.nextInt();
		
		
		int matrix [][]=new int[rows][columns];
		int transpose [][]=new int[columns][rows];
		
		
		System.out.println("Entered the elements for matrix: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<columns;i++)
		{
			for(int j=0;j<rows;j++)
			{
				transpose[j][i]=matrix[i][j];
			}
		}

		
		System.out.println("The transpose of Entered the elements: ");
		for(int i=0;i<columns;i++)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
