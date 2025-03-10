package PatternAssignment;

public class P93 {
	public static void b(int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i>0&&i<n-2&&i+j>=n/3&&i-j>=-(n/2)-1&&i-j<=(n/2)&&i+j<=n+(n/3)+1)
				//if()	
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
		b(12);
	}

}
