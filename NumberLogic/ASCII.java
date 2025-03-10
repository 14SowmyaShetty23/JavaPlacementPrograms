package javatraining;

public class ASCII {
	public static void circle(char r)
	{
		if(r>64&&r<92)
		{
			System.out.println("U");
		}
		else if(r>96&&r<123)
		{
			System.out.println("L");
		}
		else
		{
			System.out.println("S");
		}
	}
	public static void main(String [] a)
	{
		circle('/');
	}

}
