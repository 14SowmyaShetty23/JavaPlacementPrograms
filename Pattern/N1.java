package Patterns;

public class N1 {
	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==n/2||j==n/2||i==n-1)
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
