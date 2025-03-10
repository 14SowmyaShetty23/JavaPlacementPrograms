package javatraining;

public class PerfectSquare {
	public boolean isperfectSquare(int n)
	{
		for(int i=0;(i*i)<=n;i++)
		{
			if((i*i)==n)
			{
				return true;
			}
		}
		return false;
	}
	public void perfectSquare(int n)
	{
		System.out.println((isperfectSquare(n))?"yes":"no");
	}
	public static void main(String []arg)
	{
		PerfectSquare object =new PerfectSquare();
		object.perfectSquare(35);
		object.perfectSquare(36);
	}
	

}
