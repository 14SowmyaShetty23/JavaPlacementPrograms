package Recursion;

public class FirstOccurence {
	public static int i=0;
	public static void firstOccurence(int a[],int e)
	{
		if(a[i]==e)
		{
			System.out.println(i);
			return;
		}
		else
		{
			i=i+1;
			firstOccurence(a,e); 
		}
			
	}
	public static void main(String [] arg)
	{
		int [] a= {1,2,3,4,5,3};
		int e=3;
		
		firstOccurence(a,e);
	}

}
