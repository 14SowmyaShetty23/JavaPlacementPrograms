package Recursion;

public class Palindrome {
	public static int digit=0;
	public static int  palindrome(int n)
	{
		
		if(n==0)
		{
			return digit;
			
		}
		else
		{
			int r=n%10;
			digit=(digit*10)+r;
			return palindrome(n/10);
			
		}
	}
	public static void main(String []ar)
	{
		int o=1231;
		int n=palindrome(o);
		if(n==o)
		{
			System.out.println("palinderom");
		}
		else 
		{
			System.out.println(" not palinderom");
		}
	}

}
