package javatraining;

public class SmallNumber {
	public static void smallNumber(int n) {
		
			int original=n;
			
			int r=0;
			int s=n%10;
			n/=10;
			while(n!=0)
			{
				r=n%10;
				if(s>r)
				{
					
					s=r;
				}
				
								
				n/=10;
			}
			System.out.println("Second lasgest number in "+original+"is"+s);
		}
		public static void main(String []a)
		{
			smallNumber(1290643485);

	}

}
