package javatraining;

public class HappyNumberRange {
	public int add(int n)
	{
		int sum=0;
		int r=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r);
			n=n/10;
		}
		
		return sum;
	}
	public void happyNumber(int n)
	{
		int o=n;
		while(add(n)>=10)
		{
			n=add(n);
			if(add(n)==1)
			{
				System.out.println(o);
				return ;
			}
			}
		
		
	}
	 public static void main(String [] a)
	    {
		 HappyNumberRange obj =new HappyNumberRange();
		 for(int i=1;i<1000;i++)
	        obj.happyNumber(i);
	        
	    }

}
