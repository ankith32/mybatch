package basicprograms;
import java.util.Scanner;

public class tabmul {

	public static void main(String[] args) 
	{
		int n,i;
		 Scanner scan = new Scanner(System.in);
			System.out.println("enter n value");
			n=scan.nextInt();
		// TODO Auto-generated method stub
		
		for(i=1;i<10;i++)
		{
			System.out.println(n + " * " + i + " = " + (n * i));
		}

	}

}
