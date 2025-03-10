package javatraining;

public class SpynumberRange {
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
	public void spyNumber(int n)
	{
		
		if(mul(n)==add(n))
		{
			System.out.println(n);
		}
	}
	public static void main(String [] arg)
	{
		SpynumberRange obj = new SpynumberRange();
		for(int i=0;i<=10000;i++) {
			obj.spyNumber(i);
            }
		
		
		
	}

}
