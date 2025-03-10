package javatraining;

public class Spynumber {
	public int add(int n)
	{
		int sum=0;
		int r=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		
		return sum;
	}
	public int mul(int n)
	{
		int prod=1;
		int r=0;
		while(n!=0)
		{
			r=n%10;
			prod=prod*r;
			n=n/10;
		}
		
		return prod;
	}
	public void spyNumber(int n)
	{
		
		System.out.println(((mul(n)==add(n)))?"Yes":"no");
	}
	public static void main(String [] arg)
	{
		Spynumber obj = new Spynumber();
		obj.spyNumber(20);
		obj.spyNumber(9);
		obj.spyNumber(0);
		obj.spyNumber(1124);
		
	}
}
