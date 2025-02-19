// 1) n=1234 ----->  output = 4          // Get only the last digit

// Test case 1:
//     n=1234556 --> o/p : 6
// Test case 2:
//     n=150       --> o/p : 0
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    void result(int number1)
    {
       
        System.out.print(number1%10);
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
