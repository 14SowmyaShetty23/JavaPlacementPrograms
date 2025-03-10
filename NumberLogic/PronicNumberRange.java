package javatraining;



public class PronicNumberRange {
	 public static boolean isPronicNumber(int n) {
	        for (int i = 0; i * (i + 1) <= n; i++) {
	            if (i * (i + 1) == n) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        for(int i=0;i<100;i++)
	        {
	        	if(isPronicNumber(i))
	        	{
	        		System.out.println(i);
	        	}
	        }
	       
	    }
}
