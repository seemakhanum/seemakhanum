package recursion;
import java.util.Scanner;
public class CountNumberOfDigit {
		int count=0;
		int count_digit(int num)
		{
		   
		    if(num!=0)
		    {
		        count++;
		        count_digit(num/10);
		    }
		    return count;
		}
		public static void main(String[] args) {
			Scanner cs=new Scanner(System.in);
		    int n;
		    System.out.print("Enter a number:");
		    n=cs.nextInt();
		    CountNumberOfDigit ob=new CountNumberOfDigit();
		    System.out.print("The number of digits in the Given Number is "+ob.count_digit(n));
		    cs.close();


	}

}
