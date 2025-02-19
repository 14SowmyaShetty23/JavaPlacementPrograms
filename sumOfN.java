//Write a program to the sum of n natural numbers.
import java.util.*;
class Sum{
    public int summation(int n)
    {
        int sum=0;
        int i=1;
        while(i<=n)
        {
            sum+=i;
            i++;
        }
        return sum;
    }
     public static void main (String[] args) {
         Sum object = new Sum();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        int a =object.summation(input);
       System.out.println(a);
       
        
        
    }
}