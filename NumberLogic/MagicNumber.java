package javatraining;

public class MagicNumber {
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
		System.out.println((magicNumber(n)?"true":"false"));
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
		MagicNumber object = new MagicNumber();
		object.ismagicNumber(1);
	object.ismagicNumber(3);
		object.ismagicNumber(1234);
	}

}
