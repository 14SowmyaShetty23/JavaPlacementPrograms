package javatraining;

public class Narcissistic {
	public static int lenght(int n)
	{
		int i=0;
		while(n!=0)
		{
			n=n/10;
			i++;
		}
		return i;
	}
	public  static int pow(int r,int l)
	
	{
		
		int r1=1;
		while(l>0)
		{
			r1=r1*r;
			l--;
		}
		return r1;
	}
	
	public static boolean armstrong(int n)
	{
		int l=lenght(n);
		int original = n;
		int r=0;
		int armstrong=0;
		
		while(n!=0)
		{
			r=n%10;
			armstrong =armstrong+pow(r,l);
			n=n/10;
		}
		
		if(armstrong==original)
		{
			System.out.println(original);
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
	public static void main(String [] arg)
	{
		//ArmstrongRange obj = new ArmstrongRange();
		int n=15;
		int i=0;
		int count=0;
		while(true)
		{
			if(armstrong(i))
			{
				count++;
				if(count==n)
				{
					return;
				}
			}
			i++;
		}
	}
}
