//number logic where n =1234 output is 4
//number logic where n =1234 output is 123
//number logic where n =1234 output is 1
//number logic where n =1234 output is 234
import java.util.Scanner;

class Number
{
    
    public void n1(int n){
        System.out.println(n%10);
    }
    public void n2(int n){
        System.out.println(n/10);
    }
    public void n3(int n,int dig){
        System.out.println(n/(dig));
    }
    public void n4(int n,int dig){
        System.out.println(n%(dig));
    }

    public int digits(int n)
    {
        int count = 1;
        while(n>10)
        {
            n=n/10;
            count=count*10;
	
        }
        return (count);
        
    }
	public static void main (String[] args) 
	{
		Number object = new Number();
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
	    int dig =	object.digits(number);
		object.n1(number);
		object.n2(number);
		object.n3(number,dig);
		object.n4(number,dig);
	}
}





