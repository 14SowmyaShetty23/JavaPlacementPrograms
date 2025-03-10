package javatraining;

public class StrongNumberRange {
	public int factorial(int n)
	{
		return ((n==0)||(n==1)? 1:(n*factorial(n-1)));
	}
	
	
	public void strongNumberRange(int n)
	{
		int original =n;
		int strongnumber = 0;
		int r=0;
			while(n!=0)
			{
				r=n%10;
				strongnumber=strongnumber+factorial(r);
				n=n/10;
				
				
			}
			if(strongnumber==original)
			{
				System.out.println( original);
			}
				}
	public static void main(String [] arg)
	{
		StrongNumberRange obj = new StrongNumberRange();
		for(int i=1;i<150;i++)
			obj.strongNumberRange(i);
		
	}
}
