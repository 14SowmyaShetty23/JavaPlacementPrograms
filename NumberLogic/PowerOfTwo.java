package javatraining;

public class PowerOfTwo {
	
		public boolean power(int n){
		    if(n==0)
					{
						return false;
					}
					else
					{
					return ((n>0)&&((n&(n-1))==0)?true:false);
					}

		}
		public void ispower(int n)
		{
			System.out.println((power(n))?"True":"flase");
		}
		public static void main(String [] arg)
		{
			PowerOfTwo object =new PowerOfTwo();
			
			object.ispower(0);
			object.ispower(1);
			object.ispower(2);
			
			
		}
	}



