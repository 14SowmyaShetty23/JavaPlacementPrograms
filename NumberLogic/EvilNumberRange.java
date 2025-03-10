package javatraining;

public class EvilNumberRange {
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
		int  n1 =decimalToBinary(n);
		int c=0;
		while(n1!=0)
		{
			int r=n1%10;
			if(r==1)
			{
				c++;
			}
			n1/=10;
		}
		if(c%2==0)
		{
			System.out.println(n);
			}
		
	}
	public static void main(String []a)
	{
		for(int i =1;i<=10000;i++)
			isevil(i);
	}

}
