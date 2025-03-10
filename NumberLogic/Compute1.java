package javatraining;

public class Compute1 {
	public void print(int n){
        System.out.println(1/factorial(n));
    }
    public float factorial(int n){
       if ((n==1)||(n==0))
        {
            return 1;
        }
        else{
           return (n*factorial(n-1));
        }
    }
   public static void main(String [] arg)
   {
       Compute1 obj= new Compute1();
       
       obj.print(5);
       
   }
}
