package javatraining;

public class NthNeonNumber {
	public int checker(int n)
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
	public boolean neonNumber(int n)
	{
		int t=n*n;
		return ((checker(t)==n)?true:false);
	}
	public void isneonNumber(int n)
	{
		int count =0;
		int num=0;
		while(true)
		{
			if(neonNumber(num))
			{
				count++;
				if(n==count)
				{
					System.out.println(num);
					return;
				}
			}
			num++;
		}
		
	}
	
	public static void main(String [] arg)
	{
		NthNeonNumber obj = new NthNeonNumber();
		obj.isneonNumber(1);
		
		
	}
}
