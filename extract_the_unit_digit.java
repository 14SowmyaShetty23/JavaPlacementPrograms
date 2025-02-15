//program to extract the unit digit of the given number
import java.util.Scanner;

class unitdigit
{
    public void unitdigitextracter(int n)
    {
        System.out.println("The unit digit of the given number modulo operator");
        System.out.println(n%10);
    }
    public void unitdigitextracter1(int n)
    {
        System.out.println("The unit digit of the given number using non tempoary ");
        int a=n/10;
        int b =a*10;
        int c=n-b;
        System.out.println(c);
        
    }
    public void unitdigitextracter2(int n)
    {
        System.out.println("The unit digit of the given number using non tempoary and modulo operator");
        System.out.println(n-((n/10)*10));
    }
    
   

    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n;
	    System.out.println("Enter the number");
	    Scanner sc=new Scanner(System.in);
	    n = sc.nextInt();
	   sc.close();
	    unitdigit ob = new unitdigit();
	   ob.unitdigitextracter(n);
	   ob.unitdigitextracter1(n);
	   ob.unitdigitextracter2(n);
	    
	    

	}
}
