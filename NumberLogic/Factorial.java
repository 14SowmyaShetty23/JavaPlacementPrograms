package javatraining;

public class Factorial {

	public int factorial(int n){

        return (((n==1)||(n==0))? 1: (n*factorial(n-1)));
     }
    public static void main(String [] arg)
    {
    	Factorial obj= new Factorial();
        
       System.out.println( obj.factorial(5));
        
    }
}
