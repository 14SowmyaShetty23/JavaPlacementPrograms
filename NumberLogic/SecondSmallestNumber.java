package javatraining;

public class SecondSmallestNumber {
	public static void secondSmallestNumber(int n) {
	int original=n;
	
	int small=(n%10);
	n=n/10;
	int r=0;
	int sec=0;
	
	while(n!=0)
	{
		r=n%10;
		if(small>r)
		{
			sec=small;
			small=r;
		}
		else
			if(sec>r)
			{
				sec=r;
			}
		
						
		n/=10;
	}
	System.out.println("Second lasgest number in "+original+"is"+sec);
	}
public static void main(String []a)
{
	secondSmallestNumber(8206345);
}

}
