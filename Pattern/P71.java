package PatternAssignment;

public class P71 {
	public static void b(int n) {
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(j==n-1||j==(n/2)+1&&i<(n/2)+1||j==n/2&&i<(n/2)-1)
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
