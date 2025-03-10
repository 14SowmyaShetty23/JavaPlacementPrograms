package Recursion;

public class PrintArraySize {
	public static void printArrayElements(int a[],int i)
	{
		if(i>a.length)
		{
			System.out.println(i-1);
		}
		else
		{
			printArrayElements(a,i+1);
		}
			
	}
	public static void main(String [] arg)
	{
		
		int [] a= {9,2,3,8,4,5};
		printArrayElements(a,0);
	}
}
