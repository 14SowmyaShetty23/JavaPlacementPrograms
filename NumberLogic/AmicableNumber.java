package javatraining;

public class AmicableNumber {
	public static void  amicableNumber(int m,int n)
	{
		System.out.println(((isdivSum(m)==n)&&(isdivSum(n)==m))?"True":"false");
	}
	
	public static int isdivSum(int m)
	{
		int sum=0;
		
		for(int i=1;i<=(m/2);i++)
		{
			
			if((m%i)==0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
			
		}
		
		System.out.println();
		
		return sum;
	}
	public static void main(String []a)
	{
		amicableNumber(220,284);
	}
}
