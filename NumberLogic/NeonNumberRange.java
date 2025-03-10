package javatraining;

public class NeonNumberRange {
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
		if(checker(t)==n)
{
			System.out.println(n);
}
	}
	public static void main(String [] arg)
	{
		NeonNumberRange obj = new NeonNumberRange();
		for(int i=0;i<100;i++) {
			obj.neonNumber(i);
            }
		
	}

}
