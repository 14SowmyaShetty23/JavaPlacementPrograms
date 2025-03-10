package javatraining;
//WAP to swap two number Without using temp variable.
public class Swap {
	public static void swap(int a,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}
	public static void main(String []a )
	{
		swap(6,7);
	}

}
