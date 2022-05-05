package technoserve;
import java.util.Scanner; 
public class ArrayTranpose {

	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row = s1.nextInt();
		System.out.println("enter the number of columns");
		int col = s1.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter" + row*col + "elements to the matrix");
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				a[i][j]=s1.nextInt();
			}
		}
		for(int i=0;i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}

}
