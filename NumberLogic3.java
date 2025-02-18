// number logic questions
// equation used number2/(number of digit based zero)+number1
// ----->input if number1=1234 number2=77
// ----->output
// ----->771234(number1is +ve number2 is +ve sign)
// ----->-771234(number1is +ve number2 is -ve sign)
// ----->771234(number1is -ve number2 is +ve sign)
// ----->-771234(number1is -ve number2 is -ve sign)
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    int digit(int number1){
       int  count =1;
        while(number1!=0)
        {
            number1 = number1/10;
            count=count*10;
        }
        return count;
    }
    int bothlesser(int number1,int number2)
    {
        return ((number2*digit(number1))+number1);
    }
    int number2lesser(int number1,int number2)
    {
        number1=(-1)*number1;
        number2=(-1)*number2;
        return (-(number2*digit(number1))+number1);
    }
    int bothgreat(int number1,int number2)
    {
        return ((number2*digit(number1))+number1);
    }
    int number1lesser(int number1,int number2)
    {
        number1=(-1)*number1;
        return ((number2*digit(number1))+number1);
    }
      void result(int number1,int number2)
    {
         if(number1<0&&number2<0)
         {
             System.out.println(bothlesser(number1,number2));
         }
         else
         if(number1>0&&number2<0){
            System.out.println(number2lesser(number1,number2));
         }
         else
         if(number1>0&&number2>0)
         {
             System.out.println(bothgreat(number1,number2));
         }
         else
         {
             System.out.println(number1lesser(number1,number2));
         }
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
