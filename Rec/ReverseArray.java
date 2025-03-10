package Recursion;

public class ReverseArray {
	public static void printArrayElements(int n,int a[])
	{
		if(n>=0)
		{
			System.out.println(a[n]);
			printArrayElements(n-1,a);
			
		}
		else
		{
			
			return;
		}
			
	}
	public static void main(String [] arg)
	{
		int n=5;
		int [] a= {9,2,3,4,5};
		printArrayElements(n-1,a);
	}
}
