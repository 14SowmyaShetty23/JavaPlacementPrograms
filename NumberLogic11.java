// 8). n=1234, m=77   ------ output = 7734        // Replace "m" in  "n" in front position

// Test case 1:
//     n=1234556, m=693 --> o/p :  6934556
// Test case 2:
//     n=15, m=9      --> o/p :  95
import java.lang.*;
import java.io.*;
import java.util.*;

class Codechef
{
    int digit(int number2)
    {
        int count=1;
        while(number2!=0)
        {
            number2=number2/10;
            count = count*10;
        }
        return count;
    }
    void result(int number1,int number2)
    {
        int n=number1%digit(number2);
        System.out.print(number2+(n*digit(number2)));
    }
	public static void main (String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    int number1 = input.nextInt();
	    int number2 = input.nextInt();
	    
	    Codechef ob = new Codechef();
	ob.result(number1,number2);
	input.close();

	}
}
