package javatraining;
//Write a program to find the Generic root of a number.

public class GenericRoot {
	public static int add(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
			
		}
		return sum;
	}
	public static int genericRoot(int n)
	{
		while(n!=0)
		{
			if(n<10)
			{
				return n;
			}
			else
			{
				n=add(n);
			}
		}
		return 0;	}
	public static void main(String [] a)
	{
		System.out.println(genericRoot(123445));
	}

}
