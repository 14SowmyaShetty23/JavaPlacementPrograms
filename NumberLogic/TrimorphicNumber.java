package javatraining;
import java.util.Scanner;
public class TrimorphicNumber {
	public  int length(int n) {
        int c=1;
        
        while(n!=0) {
         
        c=c*10;
        n/=10;
        }
	     
	      return c;
	    }

	public  boolean trimorphicNumber(int n) {
		        
		      int t=n*n*n;
		      int l=length(n);
		      return ((t%l)==n)?true:false;
		      
		    }
	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        TrimorphicNumber ob=new TrimorphicNumber();
		        
		        System.out.print("Enter a number:");
		        int number = sc.nextInt();
	
		        
		        if (ob.trimorphicNumber(number)) {
		            System.out.println(number + " is a Pronic Number.");
		        } else {
		            System.out.println(number + " is NOT a Pronic Number.");
		        }
	
		        sc.close();
		    }
		
}
