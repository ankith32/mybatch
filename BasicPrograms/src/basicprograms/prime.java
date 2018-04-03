package basicprograms;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, i, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		num=sc.nextInt();
		
		for(i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
		}
		if(num==0||num==1)
		{
			System.out.println("not a prime");
		}
		else
		if(count == 0)
		{
			System.out.print("This is a Prime Number");
		}
		else
		{
			System.out.print("This is not a Prime Number");
		}
	}
}
