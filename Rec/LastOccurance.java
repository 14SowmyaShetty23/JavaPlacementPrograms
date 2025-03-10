package Recursion;

public class LastOccurance {
	//public static int i=0;
	public static void firstOccurence(int a[],int e,int n)
	{
		
		if(a[n]==e)
		{
			System.out.println(n);
			return;
		}
		else
		{
			
			firstOccurence(a,e,n-1); 
		}
			
	}
	public static void main(String [] arg)
	{
		int [] a= {1,2,3,4,5,3};
		int e=5;
		int n=a.length;
		firstOccurence(a,e,n-1);
	}

}
