package javatraining;

public class IthBitOff {
	public static void off(int n,int i)
	{
		System.out.println(n&(~(1<<i)));
	}
	public static void main(String [] a)
	{
		off(10111,2);
	}

}
