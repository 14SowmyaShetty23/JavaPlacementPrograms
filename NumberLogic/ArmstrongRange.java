package javatraining;

public class ArmstrongRange {
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
	
	public void armstrong(int n)
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
		}
		
		
	}
	public static void main(String [] arg)
	{
		ArmstrongRange obj = new ArmstrongRange();
		for(int i=10;i<=1000;i++)
		{
		obj.armstrong(i);
		}
	}
}
