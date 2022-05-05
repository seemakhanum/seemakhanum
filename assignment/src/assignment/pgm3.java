package assignment;
import java.util.Scanner;
class pgm3 {

	public static void main(String[] args) {
		
		int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the nof elements");
        int x=s.nextInt();
        int[]a=new int[x];
        System.out.println("enter the elements of the array");
        for(int i=0;i<x;i++)
        {
        	a[i]=s.nextInt();
        }
        System.out.println("enter the key value");
        int key=s.nextInt();
        for(int i=0;i<x;i++)
        {
        	if (key==a[i])
        	{
        		count++;
        	}
        }
        if(count==0)
        {
        	System.out.println("key not found");
        }
        else
        {
        	System.out.println("key found");
        }
	}

}