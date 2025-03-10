package javatraining;

public class Armstrong {
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
		System.out.println(original +":"+armstrong);
		System.out.println((armstrong==original)?"Yes":"no");
		
		
	}
	public static void main(String [] arg)
	{
		Armstrong obj = new Armstrong();
		obj.armstrong(153);
		obj.armstrong(154);
	}

}
