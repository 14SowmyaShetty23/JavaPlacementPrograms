package javatraining;

public class TrimorphicNumberRange {
	public  int length(int n) {
        int c=1;
        
        while(n!=0) {
         
        c=c*10;
        n/=10;
        }
	     
	      return c;
	    }

	public  void trimorphicNumber(int n) {
		        
		      int t=n*n*n;
		    if ((t%length(n))==n)
		    {
		      System.out.println(n);
		    } 
		      
		    }
	
		    public static void main(String[] args) {
		       // Scanner sc = new Scanner(System.in);
		    	TrimorphicNumberRange ob=new TrimorphicNumberRange();
		        
		        for(int i=1;i<1000;i++)
		        {
		        	ob.trimorphicNumber(i);
		        }
		 
	
	//	        sc.close();
		    }

}
