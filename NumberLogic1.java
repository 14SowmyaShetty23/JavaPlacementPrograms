
import java.util.Scanner;

class Number
{   
    public void operation1(int number1,int number2)
    {
        System.out.println(number1+""+number2);
    }
    public void operation2(int count,int number1,int number2)
    {
       
       System.out.println((number1/(count/10))+""+number2);
       
    }
    public void operation3(int number1,int number2)
    {
        System.out.println(number2+""+number1);
    }
    
    public void operation5(int count,int number1,int number2)
    {
       
       System.out.println((number1/(count/100))+""+number2+""+(number1%(count/100)));
       
    }
    public void operation4(int count,int number1,int number2)
    {
       
       System.out.println((number1%(count/10))+""+number2);
       
    }
     public int digits(int n)
    {
        int count = 1;
        while(n>10)
        {
            n=n/10;
            count=count++;
        }
        return (count);
    }
    
	public static void main (String[] args) 
	{
		Number object = new Number();
		Scanner sc =new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		object.operation1(number1,number2);
		int count=object.digits(number1);
		object.operation2(count,number1,number2);
		object.operation3(number1,number2);
		object.operation4(count,number1,number2);
		object.operation5(count,number1,number2);
	    
	}
}
