// 5) n=1234    -------> output = 1      // Get only the first digit

// Test case 1:
//     n=1234556 --> o/p : 1
// Test case 2:
//     n=850       --> o/p : 8
import java.lang.*;
import java.io.*;
import java.util.*;

class Codechef
{
    int digit(int number1)
    {
        int count=1;
        while(number1>10)
        {
            number1=number1/10;
            count = count*10;
        }
        return count;
    }
    void result(int number1)
    {
        System.out.print(number1/digit(number1));
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
