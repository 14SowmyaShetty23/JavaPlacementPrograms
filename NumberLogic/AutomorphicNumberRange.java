package javatraining;

public class AutomorphicNumberRange {
	public int lenght(int n)
	{
		int c=1;
		while(n!=0)
		{
			c=c*10;
			n=n/10;
			
		}
		return c;
	}
	public void automorphicNumber(int n)
	{
		int l=lenght(n);
		int expo = n*n;
		if((expo%l)==n)
		{
			System.out.println(n);
		}
	}
	
	public static void main(String [] arg)
	{
		AutomorphicNumberRange object = new AutomorphicNumberRange();
		for(int i=10;i<=1000;i++)
		{
		object.automorphicNumber(i);
		}
		
		
	}
}
