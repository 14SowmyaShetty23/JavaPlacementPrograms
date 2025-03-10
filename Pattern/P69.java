package PatternAssignment;

public class P69 {
	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n/4&&i>=(n-1)/2||j==n/2&&i>(n/3)+1)
				{
					System.out.print("*");
				}else
				{
					System.out.print("");
				}
				
				
			
		}
			System.out.println();
	}
	}
	public static void main(String []a)
	{
		b(6);
	}
}
