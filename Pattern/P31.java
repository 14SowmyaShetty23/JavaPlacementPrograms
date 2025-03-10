package PatternAssignment;

public class P31 {
	public static void b(int n)
	{
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==(n/2)||i-j==-(n/2))
				{
					System.out.print
							((char)(65+(n/2)-i)+" ");
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
		b(9);
	}

}
