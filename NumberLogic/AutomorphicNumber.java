package javatraining;

public class AutomorphicNumber {
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
		System.out.println(((expo%l)==n)?"Yes":"no");
	}
	
	public static void main(String [] arg)
	{
		AutomorphicNumber object = new AutomorphicNumber();
		object.automorphicNumber(6);
		object.automorphicNumber(25);
		object.automorphicNumber(24);
		
	}
}
