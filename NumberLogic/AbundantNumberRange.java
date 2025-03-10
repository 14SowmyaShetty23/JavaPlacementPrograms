package javatraining;

public class AbundantNumberRange {
	public void abundantNumber(int n)
	{
		{
			//int original = n;
			int i=1;
			int sum=0;
			while(i<=(n/2))
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
				i++;
			}
			
			
		
		
		if(n<sum)
		{
			System.out.println(n);
		}
	}
	}
	
	public static void main(String [] arg)
	{
		AbundantNumberRange object = new AbundantNumberRange();
		for(int i=0;i<=1000;i++)
		{
		object.abundantNumber(i);
		}
	}
}
