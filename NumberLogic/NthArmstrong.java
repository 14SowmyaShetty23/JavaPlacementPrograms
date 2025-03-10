package javatraining;

public class NthArmstrong {
	public int lenght(int n)
	{
		int i=0;
		while(n!=0)
		{
			n=n/10;
			i++;
		}
		return i;
	}
	public int pow(int r,int l)
	
	{
		
		int r1=1;
		while(l>0)
		{
			r1=r1*r;
			l--;
		}
		return r1;
	}
	
	public boolean armstrong(int n)
	{
		int l=lenght(n);
		int original = n;
		int r=0;
		int armstrong=0;
		
		while(n!=0)
		{
			r=n%10;
			armstrong =armstrong+pow(r,l);
			n=n/10;
		}
		System.out.println(original +":"+armstrong);
		return ((armstrong==original)?true:false);
		
		
	}
	public void isarmstrong(int n)
	{
        int count = 0;
        int num = 2; 
        
        while (true) {
            if (armstrong(num)) {
                count++;
                if (count == n) {
                    System.out.println(n + "th perfect number is: " + num);
                    return;
                }
            }
            num++;
        }
	}
	public static void main(String [] arg)
	{
		NthArmstrong obj = new NthArmstrong();
		obj.isarmstrong(1);
		obj.isarmstrong(5);
	}


}
