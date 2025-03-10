package javatraining;

public class PrimeRange {
	public  boolean cheaker(int n)
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
    public  void prime(int n)
    {
       
      if(cheaker(n))
      System.out.println(n);
    }
    public static void main(String [] a)
    {
    	PrimeRange obj =new PrimeRange();
    	for(int i=10;i<=100;i++) {
            obj.prime(i);
            }
        
    }

}
