package javatraining;

public class LCM {
	 public  int gcd(int a,int b)
	    { 
	        
	       return ((a%b==0)?b:gcd(b,(a%b)));
	    }
	    public  void gcd1(int a,int b)
	    { 
	        
	       System.out.println((a*b)/gcd(a,b));
	    }
	    
	    public static void main(String [] a)
	    {
	        LCM obj =new LCM();
	        obj.gcd1(12,8);
	        obj.gcd1(24,2);
	        
	        
	    }

}
