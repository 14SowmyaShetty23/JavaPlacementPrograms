package javatraining;

public class HCF {
	public  int gcd(int a,int b)
    { 
        
       return ((a%b==0)?b:gcd(b,(a%b)));
    }
    public  void gcd1(int a,int b)
    { 
        
       System.out.println(gcd(a,b));
    }
    
    public static void main(String [] a)
    {
        HCF obj =new HCF();
        obj.gcd1(12,8);
        obj.gcd1(24,2);
        
        
    }

}
