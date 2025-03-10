package javatraining;

public class NthEvilNumber {
	public static int decimalToBinary(int n) {
		int pow=1;
		int sum=0;
		while(n!=0) {
			int r=n%2;
			sum+=(pow*r);
			n/=2;
			pow*=10;
		}
		return sum;
	}
	public static boolean isevil(int n)
	{
		 n =decimalToBinary(n);
		int c=0;
		while(n!=0)
		{
			int r=n%10;
			if(r==1)
			{
				c++;
			}
			n/=10;
		}
		return	((c%2==0)?true:false);
		
	}
	public static void evil(int n)
	{
		int i=0;
		int c=0;
		while(true)
		{
			
			if(isevil(i))
			{
				c++;
				if(c==n)
			{
				System.out.println(i);
				return;
			}
				}
			i++;
			
		}

	}
	public static void main(String []a)
	{
		evil(4);
	}

}
