package javatraining;

public class HarshadNumberRange {
	public void harshadNumber(int n)
	{
		int o=n;
		int r=0;
		int sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
			
		}
		if((o%sum)==0)
		{
			System.out.println(o);
		}
	}
	
	public static void main(String [] arg)
	{
		HarshadNumberRange object = new HarshadNumberRange();
		for(int i=1;i<=1000;i++) {
		object.harshadNumber(i);
		}
	}
}
