// 2) n=1234 -----> output = 123          // Only remove the last digit

// Test case 1:
//     n=1234556 --> o/p :  123455
// Test case 2:
//     n=150       --> o/p :   15
import java.lang.*;
import java.io.*;
import java.util.*;

class Codechef
{
    void result(int number1)
    {
        System.out.print(number1/10);
    }
	public static void main (String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    int number1 = input.nextInt();
	     
	    Codechef ob = new Codechef();
	ob.result(number1);
	input.close();

	}
}
