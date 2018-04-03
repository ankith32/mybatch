package iterations;

public class Variables {

	
		int a=10;
		static int b=30;
		public static void main(String[] args)
		{
		
			int c=20;
			Variables v=new Variables();
			System.out.println("local variable:"+c);
			System.out.println("instance variable:"+v.a);
			System.out.println("static variable:"+b);
			
		}

	}