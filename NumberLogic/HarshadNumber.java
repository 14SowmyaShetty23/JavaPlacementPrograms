package javatraining;

public class HarshadNumber {
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
		System.out.println(((o%sum)==0)?"Yes":"N0");
	}
	
	public static void main(String [] arg)
	{
		HarshadNumber object = new HarshadNumber();
		object.harshadNumber(12);
		object.harshadNumber(353);
	}

}
