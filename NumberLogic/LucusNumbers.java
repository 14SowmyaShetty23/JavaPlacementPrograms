package javatraining;

public class LucusNumbers {
	public static void lucusNumber(int n)
	{
		int a=2;
		int b=1;
		int sum =0;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
		}
	}
	public static void main(String [] arg)
	{
		lucusNumber(10);
	}

}
