package javatraining;

public class DuckNumber {
	public static int length(int n)
	{int count=1;
	
		while(n!=0)
		{
			count=count *10;
			n/=10;
		}
		return count;
	}
	public static boolean iszero(int n)
	{
		while(n!=0)
		{
			if(n%10==0)
			{
				return true;
			}
			n/=10;
		}
		return false;
	}
	public static void ducknumber(int n)
	{
		int len=length(n);
		if((n/len)!=0)
		{
			
		
			if(iszero(n))
		{
			
				System.out.println("yes");
			
		}
		else {
			System.out.println("not");
		}
	}
	}
public static void main(String []a)
{
	ducknumber(7890);
}
}
