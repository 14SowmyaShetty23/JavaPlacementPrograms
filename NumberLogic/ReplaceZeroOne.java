package javatraining;

public class ReplaceZeroOne {
	public static int length(int n)
	{
		int digit=0;

while(n!=0)
{
	int r=n%10;
	
	digit=digit*10+r;
	n/=10;
}
	return digit;	
	}
	public static void replaceZeroOne(int n)
	{
		//int l=length(n);
		int digit=0;

while(n!=0)
{
	int r=n%10;
	if(r==0)
	{
		r=1;
	}
	else if(r==1)
	{
		r=0;
	}
	digit=digit*10+r;
	n/=10;
}
System.out.println(length(digit));
		
	}
	public static void main(String [] a)
	{
		replaceZeroOne(120203);
		
	}

}
