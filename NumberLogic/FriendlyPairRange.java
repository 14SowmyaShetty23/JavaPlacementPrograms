package javatraining;

public class FriendlyPairRange {
	public double friendlyPair(int n)
	{
	int original = n;
		int i=2;
		int sum=1;
		while(i<n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		
		return(double) (sum+original)/original;
	}
	public void isfriendlyPair(int n,int m)
	{
	if((friendlyPair(n))==(friendlyPair(m)))
			{
				System.out.println(n+" "+m);
			}
	}
	
	public static void main(String [] arg)
	{
		FriendlyPairRange object = new FriendlyPairRange();
		for(int i=6;i<=1000;i++)
		{
			for(int j=i+1;j<=1000;j++)
			{
		object.isfriendlyPair(i,j);
			}}
		
		
		
	}

}
