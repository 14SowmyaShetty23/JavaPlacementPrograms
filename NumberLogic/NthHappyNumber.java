package javatraining;

public class NthHappyNumber {
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
	public boolean happyNumber(int n)
	{
		
		while(add(n)>=10)
		{
			n=add(n);
			if(add(n)==1)
			{
				
				return true;
			}
			
		}
		
		return false;
	}
	   public void ishappyNumber(int n) {
	        int count = 0;
	        int num = 2; 
	        
	        while (true) {
	            if (happyNumber(num)) {
	                count++;
	                if (count == n) {
	                    System.out.println(n + "th perfect number is: " + num);
	                    return;
	                }
	            }
	            num++;
	        }
	    }
	 public static void main(String [] a)
	    {
		 NthHappyNumber obj =new NthHappyNumber();
	        obj.ishappyNumber(1);
	        obj.ishappyNumber(3);
	    }
	


}
