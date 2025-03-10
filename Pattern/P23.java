package PatternAssignment;

public class P23 {

	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1&&i-j<=0)
				{
				if(i<=n/2)	
				{
					System.out.print(i+1+" ");
				}else
				{
					System.out.print(n-i+" ");
				}
				
				
				}
				else
				{
					System.out.print(" ");
				}
				
			}
		
			System.out.println();
	}
	}
	public static void main(String []a)
	{
		b(9);
	}
}
