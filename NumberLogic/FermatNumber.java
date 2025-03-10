package javatraining;

public class FermatNumber {
	public static void fermat(long n) {
	long fib1=3;
	long answer=0;
	System.out.println(fib1);
	for(int i=0;i<n;i++)
	{
		answer=((fib1-1)*(fib1-1))+1;
		System.out.println((float)answer);
		fib1=answer;
	}
	}
	public static void main(String [] a)
	{
		fermat(10L);
	}
	

}
	
