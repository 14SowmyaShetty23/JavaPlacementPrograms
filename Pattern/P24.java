package PatternAssignment;

public class P24 {
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
					System.out.print(-(n-1-i-j-1)+" ");
				}else
				{
					System.out.print(j-i+1+" ");
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
