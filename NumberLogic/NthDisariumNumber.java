package javatraining;

public class NthDisariumNumber {

	public int length(int n)
	{
		int i=0;
		while(n!=0)
		{
			n=n/10;
			i++;
			
		}
		return i;
		
	}
	public int power(int r,int l)
	{
		int r1=0;
		if(l==1) {
			return r;
		}
		else
		{
			while(l>1) {
				r1=r*r;
				l--;
			}
		}
		return r1;
	}
	public boolean disariumNumber(int n)
	{
		int original=n;
		
		int sum=0;
	
		while(n!=0)
		{
			
			sum=sum+power((n%10),length(n));
			n=n/10;
			
		}
		return ((sum==original)?true:false);
	}
	public void isdisariumNumber(int n)
	{
		int i=0;
		int c=0;
		while(true)
		{
			  if(disariumNumber(i))
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
		NthDisariumNumber object = new NthDisariumNumber();
		object.isdisariumNumber(8);
	}
}
