package Recursion;

public class SumOfDigit {
	public static void sumOfDigit(int sum,int n)
	{
		if(n!=0)
		{
			int r=n%10;
			sum=sum+r;
			sumOfDigit(sum,(n/10));
		}
		else
		{
			System.out.println(sum);
			return;
		}
	}
	public static void main(String [] a)
	{
		int n=12345;
		int sum=0;
		sumOfDigit(sum,n);
	}

}
