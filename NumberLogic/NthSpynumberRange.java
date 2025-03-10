package javatraining;

public class NthSpynumberRange {
	public int add(int n)
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
	public int mul(int n)
	{
		int prod=1;
		int r=0;
		while(n!=0)
		{
			r=n%10;
			prod=prod*r;
			n=n/10;
		}
		
		return prod;
	}
	public boolean spyNumber(int n)
	{
		
		return ((mul(n)==add(n))?true:false);
	}
	public void isspyNumber(int n)
	{
		int i=0;
		int c=0;
		while(true)
		{
			  if(spyNumber(i))
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
		NthSpynumberRange obj = new NthSpynumberRange();
		obj.isspyNumber(2);
		
		
	}

}
