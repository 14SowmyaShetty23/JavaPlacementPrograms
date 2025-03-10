package javatraining;

public class TurnOffBit {
	public static void turnOffNit(int n,int i)
	{
		n=(~n);
		i=(1<<i);
		n=~(n|i);
		System.out.println(n);
	}
	public static void main(String [] a)
	{
		turnOffNit(10110,2);
	}

}
