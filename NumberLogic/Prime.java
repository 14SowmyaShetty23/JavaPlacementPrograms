package javatraining;

public class Prime {
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
       
      
      System.out.println((cheaker(n)==true) ? "prime":" not prime");
    }
    public static void main(String [] a)
    {
        Prime obj =new Prime();
        obj.prime(6);
        obj.prime(7);
    }
}
