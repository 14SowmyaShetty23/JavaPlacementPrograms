package javatraining;

public  class PerfectNumber {
	public int perfectNumber(int n)
	{
		int sum=0;
		int i=1;
		while(sum<n)
		{
			sum=sum+i;
			i++;
			
		}
		System.out.println((sum==n)?"yes":"no");
		return 0;
	}
	public static void main(String [] arg)
	{
		PerfectNumber object = new PerfectNumber();
		object.perfectNumber(6);
		object.perfectNumber(7);
		object.perfectNumber(28);
		
	}

}
