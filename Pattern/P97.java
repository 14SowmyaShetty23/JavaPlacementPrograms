package PatternAssignment;

public class P97 {
	public static void c(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1&&j<n/2||i-j==0&&j>n/2
						)
				{
					System.out.print("|");
				}else
				{
					System.out.print(" ");
				}
			}
		//	System.out.print(" ");
			
			
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1&&j<n/2||i-j==0&&j>n/2
						)
				{
					System.out.print("|");
				}else
				{
					System.out.print(" ");
				}
			}
			//System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1&&j<n/2||i-j==0&&j>n/2
						)
				{
					System.out.print("|");
				}else
				{
					System.out.print(" ");
				}
			}
			
			
			//System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1&&j<n/2||i-j==0&&j>n/2
						)
				{
					System.out.print("|");
				}else
				{
					System.out.print(" ");
				}
			}
			//System.out.print(" ");
			
			
			
			
			
			
			System.out.println();
		}
		
	}
	public static void main(String [] a)
	{
		c(
			9	);
	}
}
