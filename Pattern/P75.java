package PatternAssignment;

public class P75 {
	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1||i-j==0||i+j==n-1)
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
	public static void main(String []a)
	{
		b(7);
	}

}
