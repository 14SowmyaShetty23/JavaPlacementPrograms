package Patterns;

public class G {
	public static void c(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i*j==0)||(i==n-1)&&j<=(3*n)/4||j==(3*n)/4&&i>=(3*n)/4||i==(3*n)/4&&j>=n/4&&j<=(3*n)/4||j==n/4&&i>=n/2&&i<=(3*n)/4||i==n/2&&j>=n/4&&j<=n-1||j==n-1&&i>=n/2)
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
		c(15);
	}

}
