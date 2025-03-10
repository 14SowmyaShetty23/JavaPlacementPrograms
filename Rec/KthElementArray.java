package Recursion;

public class KthElementArray {
	
	public static void printArrayElements(int a[],int k,int i)
	{
		if(i==k)
		{
			System.out.println(a[i]);
			return;
			
		}
		else
		{
			printArrayElements(a,k,i+1);
			
		}
			
	}
	public static void main(String [] arg)
	{
		
		int [] a= {9,2,3,4,5};
		int k=3;
		printArrayElements(a,k,0);
	}
}
