package Recursion;

public class PrintIncreasing {
	public static void printDecreasing(int n)
	{
		if(n==5)
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printDecreasing(n+1);
		}
	public static void main(String [] arg)
	{
		printDecreasing(1);
	}

}
