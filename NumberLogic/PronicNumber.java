package javatraining;
import java.util.Scanner;
public class PronicNumber {
	
	    public static boolean isPronicNumber(int n) {
	        for (int i = 0; i * (i + 1) <= n; i++) {
	            if (i * (i + 1) == n) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking input from the user
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        // Checking and printing result
	        if (isPronicNumber(number)) {
	            System.out.println(number + " is a Pronic Number.");
	        } else {
	            System.out.println(number + " is NOT a Pronic Number.");
	        }

	        sc.close();
	    }
	}



