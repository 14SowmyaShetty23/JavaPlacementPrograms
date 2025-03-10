package javatraining;

public class SunnyNumber {
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
		System.out.println((sunnyNumber(n))?"True":"False");
	}
	public static void main(String [] arg)
	{
		SunnyNumber object = new SunnyNumber();
		object.isSunnyNumber(15);
		object.isSunnyNumber(10);
	}
}
