package javatraining;

public class CountNumber {
	public void count(int number)
    {
        int i=0;
        while(number!=0)
        {
            number/=10;
            i++;   
        }
        System.out.println(i);
    }
    public static void main(String [] arg)
    {
        CountNumber object = new CountNumber();
       
        object.count(987);
    }
}
