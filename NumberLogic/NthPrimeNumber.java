package javatraining;

public class NthPrimeNumber {
	public  boolean cheaker(int n)
    {
        
        
        if (n <= 1) return false;
        int i=2;
        while(i*i<=n)
        {
            if((n%i)==0)
                return false;
                
            i++;
        }
        return true;
    }
    public  void prime(int n)
    {
       
      int c=0;
      int i=2;
      while(true)
      {
    	  if(cheaker(i))
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
    	NthPrimeNumber obj =new NthPrimeNumber();
    	obj.prime(7);
        
    }
}
