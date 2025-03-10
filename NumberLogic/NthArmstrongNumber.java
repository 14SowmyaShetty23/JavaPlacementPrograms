package javatraining;

public class NthArmstrongNumber {
	public int lenght(int n)
	{
		int i=0;
		while(n!=0)
		{
			n=n/10;
			i++;
		}
		return i;
	}
	public int pow(int r,int l)
	
	{
		
		int r1=1;
		while(l>0)
		{
			r1=r1*r;
			l--;
		}
		return r1;
	}
	
	public boolean armstrong(int n)
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
		
		return 
				(armstrong==original);
		
		
	}
	
	public void isarmstrong(int n)
	{
		int i=1;
		int c=0;
		while(true)
		{
			  if(armstrong(i))
			  {
				  c++;
				  if(c==n)
				  {
					  System.out.println(i);
					  return;
				  }
			  }
			  i++;
		}
	}
	public static void main(String [] arg)
	{
		NthArmstrongNumber obj = new NthArmstrongNumber();
		obj.isarmstrong(10);
		
	}
}
