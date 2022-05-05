package technoserve;

public class EvenoddWithoutArithmetic {

	public static void main(String[] args) {
		int num = 11;	
        if((num & 1) == 0)
        {
        	System.out.println(num +" is even number");
        }
        else
        {
        	System.out.println(num +" is odd number");	
        }
	}

}
