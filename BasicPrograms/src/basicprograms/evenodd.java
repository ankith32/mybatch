package basicprograms;

import java.util.Scanner;

public class evenodd 
{
	//private static Scanner scan;

	public static void main(String args[])
	{
		
		 int n;
	        
		 Scanner scan = new Scanner(System.in);
	       
	        System.out.print("Enter a Number : ");
	        n = scan.nextInt();		     
			
	        if(n%2 == 0)
	        {
	            System.out.print("This is an Even Number");
	        }
	        else
	        {
	            System.out.print("This is an Odd Number");
	        }
	    }
}
