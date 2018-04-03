package basicprograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		int c=0,a,temp,n;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter n valusfdadfsfdasfdsfdae");
		n=sc.nextInt();

		//int n=153;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}

		if(temp==c)
		{
			System.out.println("armstrong number12333333");
		}
		else
			System.out.println("not armstrong number");
	}

}
