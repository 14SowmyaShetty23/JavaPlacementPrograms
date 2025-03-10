package javatraining;

public class MagicNumberRange {
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
		if(magicNumber(n)) {
			System.out.println(n);
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
		MagicNumberRange object = new MagicNumberRange();
		
		for(int i=0;i<1000
				;i++) {
			object.ismagicNumber(i);
            }
	}
}
