package javatraining;

public class BinaryRep {
	public static void binaryDecimal(int n)
	{
		int ans=0;
		int power=1;
		
		while(n!=0)
		{
			int r=n%2;
			ans=ans+power*r;
			n/=10;
			power*=2;			
		}
		System.out.println(ans);
	}
	public static void main(String []a)
	{
		binaryDecimal(11);
	}

}
