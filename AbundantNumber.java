package javatraining;

public class AbundantNumber {
	public void abundantNumber(int n)
	{
		int original = n;
		int i=1;
		int sum=0;
		while(sum<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
		System.out.println((original<sum)?"Yes":"No");
	}
	
	public static void main(String [] arg)
	{
		AbundantNumber object = new AbundantNumber();
		object.abundantNumber(12);
		object.abundantNumber(13);
	}
}
