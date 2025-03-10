package PatternAssignment;

public class P62 {	public static void b(int n)
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<2*n-1;j++)
		{
			
			if(i+j>=n&&i+j<=2*(n-1))
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
	b(6);
}

}
