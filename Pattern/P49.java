
package PatternAssignment;

public class P49 {
	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i-j==0)||i+j==n-1)
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
		b(5);
	}
}
