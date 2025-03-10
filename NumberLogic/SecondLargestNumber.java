package javatraining;

public class SecondLargestNumber {
	public static void secondLargestNumber(int n) {
		int original=n;
		int s=0;
		int r=0;
		int l=0;
		
		while(n!=0)
		{
			r=n%10;
			if(l<r)
			{
				s=l;
				l=r;
			}
			else
				if(s<r)
				{
					s=r;
				}
							
			n/=10;
		}
		System.out.println("Second lasgest number in "+original+"is"+s);
	}
	public static void main(String []a)
	{
		secondLargestNumber(1264345);
	}
}
