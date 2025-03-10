package javatraining;

public class LargestNumber {
	public static void largestNumber(int n) {
		int original=n;
		
		int r=0;
		int l=0;
		
		while(n!=0)
		{
			r=n%10;
			if(l<r)
			{
				
				l=r;
			}
			
							
			n/=10;
		}
		System.out.println("Second lasgest number in "+original+"is"+l);
	}
	public static void main(String []a)
	{
		largestNumber(129643485);
	}
}
