import java.util.Scanner;

class EvenOdd
{
    public void mod(int n)
    {
        System.out.println("Finding even or odd using module operator");
        if(n%2==0)
        {
            System.out.println("It's Even");
        }
        else{
            System.out.println("It's Odd");
        }
    }
    public void div(int n)
    {
        System.out.println("Finding even or odd using Div operator");
        if(((n/2)*2)==n)
        {
            System.out.println("It's Even");
        }
        else{
            System.out.println("It's Odd");
        }
    }
    public void LogOR(int n)
    {
        System.out.println("Finding even or odd using logical OR operator");
        if(((n|1)!=n))
        {
            System.out.println("It's Even");
        }
        else{
            System.out.println("It's Odd");
        }
    }
        public  void Equa(int n)
    {
        System.out.println("Finding even or odd using ((n/1)-(n+1))");
        if(((n/1)-(n+1))==0)
        {
            System.out.println("It's Even");
        }
        else{
            System.out.println("It's Odd");
        }
    }

    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n;
	    System.out.println("Enter the number");
	    Scanner sc=new Scanner(System.in);
	    n = sc.nextInt();
	   sc.close();
	    EvenOdd ob = new EvenOdd();
	    ob.mod(n);
	    ob.div(n);
	    ob.LogOR(n);
	    
	    

	}
}
