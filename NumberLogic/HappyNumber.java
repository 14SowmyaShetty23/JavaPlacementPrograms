package javatraining;

public class HappyNumber {
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
		System.out.println(sum);
		return sum;
	}
	public void happyNumber(int n)
	{
		
		while(add(n)>=10)
		{
			n=add(n);
			if(add(n)==1)
			{
				System.out.println("E");
				return ;
			}
			
		}
		
	}
	 public static void main(String [] a)
	    {
		 HappyNumber obj =new HappyNumber();
	        obj.happyNumber(49);
	        obj.happyNumber(71197);
	    }
	

}
