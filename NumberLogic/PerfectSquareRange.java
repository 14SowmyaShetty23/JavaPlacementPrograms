package javatraining;

public class PerfectSquareRange {
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
		if(isperfectSquare(n)) {
			System.out.println(n);
		}
	}
	public static void main(String []arg)
	{
		PerfectSquareRange object =new PerfectSquareRange();
		for(int i=1;i<=1000;i++)
		{
			object.perfectSquare(i);
		}
	}

}
