package javatraining;

public class StrongNumber {
	public int factorial(int n)
	{
		return ((n==0)||(n==1)? 1:(n*factorial(n-1)));
	}
	
	
	public void strongNumber(int n)
	{
		int original =n;
		int strongnumber = 0;
		int r;
			while(n!=0)
			{
				r=n%10;
				strongnumber=strongnumber+factorial(r);
				n=n/10;
				
				
			}
		System.out.println((strongnumber==original)?"Yes":"No");
	}
	public static void main(String [] arg)
	{
		StrongNumber obj = new StrongNumber();
		obj.strongNumber(145);
		obj.strongNumber(154);
	}


}
