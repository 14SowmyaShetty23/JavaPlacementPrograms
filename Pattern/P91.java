
package PatternAssignment;

public class P91 {
	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n+1;j++)
			{if(i+j<=(n/2)-1||i-j>=(n/2)||i-j<=-(n/2)||i+j>3*(n/2)
			)
				
				{
					System.out.print("*");
				
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
		b(8);
	}
}
