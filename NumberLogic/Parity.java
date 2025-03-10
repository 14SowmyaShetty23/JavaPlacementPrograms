package javatraining;

public class Parity {
	
public static boolean parity(int n)
{
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		System.out.println(r);
		if(r==1)	{
			sum++;}
		n/=10;
	}
	System.out.println(sum);
	if(sum%2==0)
	{
		
		return true;
	}
	else
	{
	return false;	
	}
	
}
public static void main(String [] a)
{
	int n=0111100;
	
	if(parity(n));
	{
		System.out.println(n*10);
	}
	
}
}
