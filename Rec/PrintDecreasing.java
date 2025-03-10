package Recursion;

public class PrintDecreasing {
	public static void printDecreasing(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
		}
	public static void main(String [] arg)
	{
		printDecreasing(5);
	}

}
