package javatraining;

public class HappyNumberRangeFirst10 {
	public static int add(int n)
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
	public static booolean happyNumber(int n)
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
	 public static void main(String [] a)
	    {
		HappyNumberRangeFirst10 obj =new HappyNumberRangeFirst10();
		 int i=0;
		 int count =0;
		 while(true)
		 {
			 
		
	       if(happyNumber(i))
	       {
	    	   count++;
	    	   System.out.println(i);
	       
	        if(count==10)
	        {
	        	return;
	        }
	        i++;
	       }
		 }
	        
	    }


}
