package javatraining;

public class NthAbundantNumber {
	
	public boolean abundantNumber(int n)
	{
		//int original = n;

		int i=1;
		int sum=0;
		while(i<=(n/2))
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		
		
	}return ((n<sum)?true:false);
	}
	
	public void isabundantNumber(int n)
	{int i=12;
	int c=0;
	while(true)
	{
		  if(abundantNumber(i))
		  {
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
		NthAbundantNumber object = new NthAbundantNumber();
		object.isabundantNumber(1);
		object.isabundantNumber(2);
	}
}
