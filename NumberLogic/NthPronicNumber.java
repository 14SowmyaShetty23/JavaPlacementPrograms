
	

	package javatraining;
	import java.util.Scanner;
	public class NthPronicNumber {
		
		    public static boolean isPronicNumber(int n) {
		        for (int i = 0; i * (i + 1) <= n; i++) {
		            if (i * (i + 1) == n) {
		                return true;
		            }
		        }
		        return false;
		    }
		    public static void PronicNumber(int n)
			{
				int i=0;
				int c=0;
				while(true)
				{
					  if(isPronicNumber(i))
					  {
						  c++;
						  if(c==n)
						  {
							  System.out.println(i);
							  return;
						  }
					  }
					  i++;
				}
			}
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Taking input from the user
		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();

		        // Checking and printing result
		        PronicNumber(number);
		           
		        

		        sc.close();
		    }
		}




