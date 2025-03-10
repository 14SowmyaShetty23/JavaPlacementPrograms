package Recursion;

public class IndicesNumber {
	 public static int count=0;
		public static void firstOccurence(int a[],int e,int n,int i)
		{
			
			if(i<n)
			{//fot(i=0;i<n;i++)
			if(a[i]==e)
			{
				System.out.println(i);
			}
			firstOccurence(a,e,n,i+1);
			}
			else
			{
				
				return;
			}
				
		}
		public static void main(String [] arg)
		{
			int [] a= {1,2,3,4,5,3,5,7,5,5,5,5};
			int e=5;
			int n=a.length;
			firstOccurence(a,e,n,0);
		}

}
