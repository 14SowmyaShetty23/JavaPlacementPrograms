package Patterns;

public class R {
	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i-j==0&&i+j>=n-2/2||i==n/2&&j<=n/2
						||i+j==n-1&&i<=n/2&&j>=n/2
						)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String [] a)
	{
		b(15);
	}
	

}
