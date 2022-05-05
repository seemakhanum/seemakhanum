package technoserve;
import java.util.Scanner;
public class Pallindrame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number ");
	    int num = sc.nextInt();
	    int temp = num;
	    int revNum = 0;
	    while (num!=0) {
	    	int digit = num% 10;
	    	revNum = (revNum * 10) + digit;
	    	num/=10;
	    	
	    }
	    
	    if(revNum == temp) {
	    	System.out.println(temp +" is a pallindrome");
	    }
	    else {
	    	System.out.println(temp +" is not ca pallindrome");
	    }
	}

	}


