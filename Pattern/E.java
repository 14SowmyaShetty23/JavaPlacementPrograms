package Patterns;

public class E {
	public static void c(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||i==(n/2))
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
