package PatternAssignment;

public class PP1 {
	public static void b(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(!(i-j<=0))
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
		b(11);
	}

}
