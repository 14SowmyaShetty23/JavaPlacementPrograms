package javatraining;

public class NthSunnyNumber {
	boolean sunnyNumber(int n)
	{
		for(int i=0;(i*i)<=(n+1);i++)
		{
			if((i*i)==(n+1))
			{
				return true;
			}
		}
		return false;
	}
	void isSunnyNumber(int n)
	{
		int count=0;
		int number =0;
		while(true)
		{
			if(sunnyNumber(number))
			{
				if(count==n)
				{
					System.out.println(number);
					return;
				}
				count++;
			}
			number++;
		}
	}
	
	public static void main(String [] arg)
	{
		NthSunnyNumber object = new NthSunnyNumber();
		object.isSunnyNumber(1);
		object.isSunnyNumber(10);
	
	}
}
