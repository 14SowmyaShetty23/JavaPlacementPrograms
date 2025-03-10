package Patterns;

public class PhoneNumber {
	public static void c(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==n-1)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(i==0||(j<n/2)&&i==(n-1)||i==n/2||j==n-1&&i<=n/2||i==n-1||(j==0&&i>=n/2))
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
		
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0&&(i<=n/2)||i==n/2||(i>=n/2)&&(j==n-1)||i==n-1)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			
			
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(i==0||j==n-1||i==n-1||i==(n/2))
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			
			}
			System.out.print(" ");
			
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
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||j==n-1||i==n-1)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0&&(i<=n/2)||i==n/2||(i>=n/2)&&(j==n-1)||i==n-1)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
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
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if((i+j)==n/2||j==(n/2)||i==n/2)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			
			System.out.print("  ");
			
			
			
			
			
			
			
			System.out.println();
		}
		
	}
	public static void main(String [] a)
	{
		c(15);
	}



}
