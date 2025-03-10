package javatraining;

public class SunnyNumberRange {
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
		if(sunnyNumber(n))
			System.out.println(n);
	}
	public static void main(String [] arg)
	{
		SunnyNumberRange object = new SunnyNumberRange();
		for(int i=0;i<=10000;i++)
			object.isSunnyNumber(i);
	}
}
