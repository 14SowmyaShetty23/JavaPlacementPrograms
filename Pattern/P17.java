package PatternAssignment;

public class P17 {
	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i-j<=0)
				{
					System.out.print(n-i+" ");
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
