package javatraining;

public class NthMagicNumberRange {
	public boolean magicNumber(int n)
	{
		if(n==1)
		{
			return true;
		}
		
		while(n>=10)
		{ 
			if(add(n)==1)
			{
				
				return true;
			}
			n=add(n);
		}
		
		
		return false;
	}
	public void ismagicNumber(int n)
	{
		int number=1;
		int c=0;
		while(true)
		{
			
		if(magicNumber(number))
		{
			c++;
			if(c==n)
			{
				System.out.println(number);
				return;
			}
			
			
		
		}
		number++;
		}
	}
	public int add(int n)
	{
		int r=0;
		int sum =0;
		while(n!=0)
		{
			r=n%10;
			sum=(sum)+r;
			n=n/10;
		}
		
		return sum;
	}
	public static void main(String [] arg) {
		NthMagicNumberRange object = new NthMagicNumberRange();
		
		 
			object.ismagicNumber(7);
            
	}

}
