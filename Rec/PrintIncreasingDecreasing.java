package Recursion;

public class PrintIncreasingDecreasing {
	 public static void printIncreasingDecreasing(int n, int current) {
	        if (current > n) {
	        	System.out.println();
	            return;
	        }
	        
	        
	        System.out.print(current);
	        
	        
	        printIncreasingDecreasing(n, current + 1);
	        
	        
	        System.out.print(current);
	    }

	    public static void main(String[] args) {
	        printIncreasingDecreasing(5, 1);
	    }
}
