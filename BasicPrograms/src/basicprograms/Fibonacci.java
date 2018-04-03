package basicprograms;
import java.util.Scanner;

public class Fibonacci {
	
	    public static void main(String args[])
	    {
		
	        int a=0, b=1, c=0, n=0;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("enter n value");
	        n = scan.nextInt();
        
	        System.out.print("Fibonacci Series : " + a + "  " + b + "  ");
	        c = a + b;	      	        
	        n= n - 2;
			
	        while(n>0)
	        {
	            System.out.print(c + "  ");
	            a = b;
	            b = c;
	            c = a + b;
	            n--;
	        }
			
	    }
}
