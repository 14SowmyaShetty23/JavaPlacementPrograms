package javatraining;

public class Classify_Abundant_deficient_and_perfect_number {

	
	public static boolean abundantNumber(int n)
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
			return true;
		}
		else
		{
			return false;
		}
	}
	}
	
	public static boolean deficientNumber(int n)
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
			
			
		
		
		if(n>sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	}
	
	public static boolean perfectNumber(int n)
	{
		int sum=0;
		int i=1;
		while(sum<n)
		{
			sum=sum+i;
			i++;
			
		}
		System.out.print(sum+" ");
		if(sum==n) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String [] ae)
	{
		int a=0;
		int d=0;
		int p=0;
		for(int i=1;i<=10000;i++)
		{
			if(abundantNumber(i))
			{
				a++;
			}
			if(deficientNumber(i))
			{
				d++;
			}
			if(perfectNumber(i))
			{
				p++;
			}
		}
		System.out.println("Number Counting [(integers) between 1 to 10,000]:");
		System.out.println("Deficient number: 7508  "+d);
		System.out.println("Perfect number: 4    "+p);
		System.out.println("Abundant number: 2488    "+a);


	}
}
	
	
	
	
	

