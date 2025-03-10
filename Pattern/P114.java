package PatternAssignment;

public class P114 {
	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				
			{
				if(i==n/2&&j==n/2)
				{
					System.out.print("0");
				}
				if(!(i+j<=n/2||(i-j)<=-(n/2)||(i+j)>=3*(n/2)||i-j>=n/2))
				
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println(
					);
		}
	}
	public static void main(String []a)
	{
		b(22);
	}

}
