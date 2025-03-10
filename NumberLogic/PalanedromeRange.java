package javatraining;

public class PalanedromeRange {
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
        if(digit==o)
        {
        	System.out.println(o);
        }
    }
    public static void main(String [] a)
    {
    	PalanedromeRange obj =new PalanedromeRange();
        for(int i=10;i<=100;i++) {
        obj.palanedrome(i);
        }
        
    }

}
