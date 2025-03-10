package javatraining;

public class NthHarshadNumber {
	public boolean harshadNumber(int n)
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
		return (((o%sum)==0)?true:false);
	}
	public void isharshadNumber(int n)
	{
		int c=0;
		int i=1;
		while(true)
		{
			if(harshadNumber(i)) {
				c++;
				if(c==n)
				{
					System.out.println(i);
					return;
				}
			}
			i++;
		}
	}
	
	public static void main(String [] arg)
	{
		NthHarshadNumber object = new NthHarshadNumber();
		object.isharshadNumber(1);
		object.isharshadNumber(5);
	}

}
