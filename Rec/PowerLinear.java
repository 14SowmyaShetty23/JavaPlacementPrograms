package Recursion;

public class PowerLinear {
	public static int count=1;
	public static void powerLinear(int b,int e,int i)
	{
		
		
		if(i>e)
		{
			System.out.println(count);
			return;
		}
		count = count *b;
		powerLinear(b,e,i+1);
	}
		
	public static void main(String [] arg)
	{
		powerLinear(2,5,1);
	}
}
