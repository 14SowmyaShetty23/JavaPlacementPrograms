package Recursion;

public class Fabonacci {
	
	public static int fib1=0;
	
	public static int fib2=1;
	
	public static void fabonacci(int fib,int n,int i)
	{
		if(i>=n)
			return ;
		else
		{
			fib=fib1+fib2;
			fib1=fib2;
			fib2=fib;
			System.out.print(fib+" ");
			fabonacci(fib,n,i+1);
		}
		
	}
	public static void main(String [] a)
	{
		System.out.print(fib1+" "+fib2+" ");
		
		fabonacci(0,10,2);
		
	}
}
