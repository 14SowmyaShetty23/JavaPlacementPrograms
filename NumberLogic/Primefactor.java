package javatraining;

public class Primefactor {
	public boolean isPrime(int n)
	{
	        
	        int i=2;
	        if (n <= 1) return false;
	        while(i*i<=n)
	        {
	            if((n%i)==0)
	                return false;
	                
	            i++;
	        }
	        return true;
	    }
	
	public void findPrimeFactor(int n) {
		int i=2;
		
		while(i<=n)
		{
			if(isPrime(i))
			{
				if((n%i)==0)
				{
					System.out.println(i);
				}
			}
			i++;
		}
		
	}
	public static void main(String [] arg)
	{
		Primefactor obj = new Primefactor();
		obj.findPrimeFactor(49);
	}

}
