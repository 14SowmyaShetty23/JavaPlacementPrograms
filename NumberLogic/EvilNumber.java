package javatraining;

public class EvilNumber {
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
	public static void isevil(int n)
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
	System.out.println	((c%2==0)?true:false);
		
		
	}
	public static void main(String []a)
	{
		isevil(16);
		isevil(1);
		isevil(100);
		isevil(10000);
	}

}
