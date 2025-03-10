package javatraining;

public class NthPerfectSquare {
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
		int count =0;
		int i=1;
		while(true)
		{
		if(isperfectSquare(i))
		{
			count++;
			if(count==n)
			{
				System.out.println(i);
				return;
			}
		}
		i++;
		}
	}
	public static void main(String []arg)
	{
		NthPerfectSquare object =new NthPerfectSquare();
		object.perfectSquare(2);
		object.perfectSquare(4);
	}
}
