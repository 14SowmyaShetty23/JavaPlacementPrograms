package javatraining;

public class Palanedrome {
	 public  void palanedrome(int n)
	    {
	        int o=n;
	        int r,digit=0;
	        while(n!=0)
	        {
	            r=n%10;
	            digit=(digit*10)+r;
	            n/=10;
	        }
	        System.out.println((digit==o)?"pal":"no");
	    }
	    public static void main(String [] a)
	    {
	        Palanedrome obj =new Palanedrome();
	        obj.palanedrome(636);
	        obj.palanedrome(1001);
	    }
}
