package javatraining;

public class CountOddEven {
	public static void Count(int n)
	{
		int odd=0;
	int even=0;
		while(n!=0)
		{
		int r=n%10;
		if(r==0);
		else if(r%2==0)
		{
			even=even+1;
			
		}
		else
		{
			odd=odd+1;
		}
		n/=10;
		}
		System.out.println("odd "+odd);
		System.out.println("even "+even);
	}
public static void main(String [] a)
{
	Count(1111246753);
}
}
