package javatraining;

public class Fibo {
	public static void fibo(int n)
	{
		int fib1=0;
		System.out.println(fib1);
	int fib2=1;
	System.out.println(fib2);
	int ans=0;
	
	for(int i=2;i<n;i++)
	{
		ans=fib1+fib2;
		System.out.println(ans);
		fib1=fib2;
		fib2=ans;
	}
		
	}
	public static void main(String []a)
	{
		fibo(10);
	}

}
