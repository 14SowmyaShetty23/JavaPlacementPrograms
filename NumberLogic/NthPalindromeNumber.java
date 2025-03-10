package javatraining;

public class NthPalindromeNumber {
	public  boolean palanedrome(int n)
    {
        int o=n;
        int r,digit=0;
        while(n!=0)
        {
            r=n%10;
            digit=(digit*10)+r;
            n/=10;
        }
        return ((digit==o)?true:false);
    }
	public void ispalanedrome(int n)
	{
		int i=0;
		int c=0;
		while(true)
		{
			  if(palanedrome(i))
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
    public static void main(String [] a)
    {
    	NthPalindromeNumber obj =new NthPalindromeNumber();
        
        obj.ispalanedrome(6);
        
        
    }
}
