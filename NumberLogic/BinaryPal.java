package javatraining;

public class BinaryPal {
	public static int decimalToBinary(int n)
	{
		int ans=0;
		int power=1;
		
		while(n!=0)
		{
			int r=n%2;
			ans=ans+power*r;
			n/=2;
			power*=10;			
		}
		
		return ans;
	}
	 public static void palanedrome(int n)
	    {
	        int o=n;
	        int r,digit=0;
	        while(n!=0)
	        {
	            r=n%10;
	            digit=(digit*10)+r;
	            n/=10;
	        }
	        System.out.println((digit==o)?"pal":"no");
	    }
	public static void main(String []a)
	{
		int n=decimalToBinary(143);
			palanedrome(n);
	}

}
