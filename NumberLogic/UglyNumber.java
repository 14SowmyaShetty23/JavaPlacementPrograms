package javatraining;

public class UglyNumber {
	public static boolean uglyNumber(int n)
	{
		int flag=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				
				if(i==2||i==3||i==1||i==5)
				{
					 flag=flag+1;
				}
				else
				{
					return false;
				}
			}
		}
		
		return true;
	}
	public static void main(String []a)
	{
		
		for(int i=1;i<=100;i++)
			if(uglyNumber(i))
			{
				System.out.println(i);
			}
		
			
	}

}
