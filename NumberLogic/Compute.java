package javatraining;

public class Compute {
	 public int pow(int x,int y)
     {
         while(y>0)
         {
             x*=x;
             y--;
             
         }
         return x;
     }
     public void print(int n,int x){
         int n1 = (x/factorial(x));
         
         System.out.println(pow(n,n1));
     }
     public int factorial(int n){
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
        Compute obj= new Compute();
        
        obj.print(4,5);
        
    }
}
