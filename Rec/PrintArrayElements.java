package Recursion;

public class PrintArrayElements {
	public static void printArrayElements(int n,int a[],int i)
	{
		if(i>=n)
		{
			return;
		}
		else
		{
			System.out.println(a[i]);
			printArrayElements(n,a,i+1);
			
		}
			
	}
	public static void main(String [] arg)
	{
		int n=5;
		int [] a= {9,2,3,4,5};
		printArrayElements(n,a,0);
	}

}
