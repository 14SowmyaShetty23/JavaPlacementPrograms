package javatraining;

public class NeonNumber {
	public int checker(int n)
	{
		int sum=0;
		int r=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
	public void neonNumber(int n)
	{
		int t=n*n;
		System.out.println((checker(t)==n)?"Yes":"no");
		
	}
	public static void main(String [] arg)
	{
		NeonNumber obj = new NeonNumber();
		obj.neonNumber(20);
		obj.neonNumber(9);
		obj.neonNumber(0);
		
	}

}
