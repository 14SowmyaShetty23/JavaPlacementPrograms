package javatraining;

public class Sum {
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
	 //n*(n+1)/2;
	     public static void main (String[] args) {
	         Sum object = new Sum();
	        
	        
	        int a =object.summation(5);
	       System.out.println(a);
	       
	        
	        
	    }

}
