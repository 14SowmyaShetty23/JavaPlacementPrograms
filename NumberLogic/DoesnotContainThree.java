package javatraining;

public class DoesnotContainThree {
	public static boolean threeInIt(int n)
	{
		if((n>=300)&&(n<=399))
		{
			return false;
		}
		while(n!=0)
		{
			int r=n%10;
			if(r==3)
			{
				return false;
				
			}
			n=n/10;
			
		}
		return true;
	}
	public static void checkthree(int n)
	
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(threeInIt(i))
			{
				count++;
			}
		}
		System.out.println(count);
	}
public static void main(String [] arg)
{
	checkthree(50);
}
}
