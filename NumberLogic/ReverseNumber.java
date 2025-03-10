package javatraining;

public class ReverseNumber {
	public  void reverseNumber(int n)
    {
        
        int r,digit=0;
        while(n!=0)
        {
            r=n%10;
            digit=(digit*10)+r;
            n/=10;
        }
        System.out.println(digit);
    }
    public static void main(String [] a)
    {
        ReverseNumber obj =new ReverseNumber();
        obj.reverseNumber(6364);
        obj.reverseNumber(1234);
    }
}
