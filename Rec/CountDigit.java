package Recursion;

public class CountDigit {
	public static void sumOfDigit(int count,int n)
	{
		if(n!=0)
		{
			count++;
			sumOfDigit(count,(n/10));
		}
		else
		{
			System.out.println(count);
			return;
		}
	}
	public static void main(String [] a)
	{
		int n=12345;
		int count=0;
		sumOfDigit(count,n);
	}
}
