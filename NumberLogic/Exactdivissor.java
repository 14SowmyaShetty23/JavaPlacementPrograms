package javatraining;

public class Exactdivissor {
	public static void div(int n)
	{
		for(int i=1;i<n;i++)
		{
			if(count(i)==9)
			{
				System.out.println(i);
			}
		}
	}
	public static int count(int n)
	{
		int count =0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		} return count;
	}
	public static void main(String []a)
	{
		div(100);
	}

}
