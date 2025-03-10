package javatraining;

public class CountZroOnce {
	public static void Count(int n)
	{
		int zero=0;
	int one=0;
	int r=0;
		while(n!=0)
		{
		 r=n%10;
		if(r==0)
		
		{
			zero++;
			
		}
		if(r==1)
		{
			one++;
		}
		
		n=n/10;
		}
		System.out.println("zero "+zero);
		System.out.println("one "+one);
	}
public static void main(String [] a)
{
	Count(124);
}

}
