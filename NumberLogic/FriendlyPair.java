package javatraining;

public class FriendlyPair {
	public float friendlyPair(int n)
	{
	int original = n;
		int i=1;
		int sum=0;
		while(sum<n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		
		return (sum)/original;
	}
	public void isfriendlyPair(int n,int m)
	{
		System.out.println(((friendlyPair(n))==(friendlyPair(m)))?"yea":"no");
	}
	
	public static void main(String [] arg)
	{
		FriendlyPair object = new FriendlyPair();
		object.isfriendlyPair(6,7);
		object.isfriendlyPair(6,28);
		object.isfriendlyPair(12,234);
		
		
	}

}
