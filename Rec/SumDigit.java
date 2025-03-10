package Recursion;

public class SumDigit {
	public static void sumDigit(int sum ,int n,int i)
	{
		if(i>n)
		{
			System.out.println(sum);
			return;
		}
		else
		{
			sum=sum+i;
			sumDigit(sum,n,i+1);
		}
	}
	public static void main(String [] a)
	{
		int sum=0;
		int n=5;
		sumDigit(sum,n,1);
	}

}
