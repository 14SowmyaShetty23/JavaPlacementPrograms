package PatternAssignment;

public class P4 {
	static void fun(int n){
		for(int i=0;i<2*n-1;i++){
			for(int j=0;j<n;j++){
				if(j>=0&&i-j>=0&&i+j<2*n-1)
				{
					if(i<n)
					{
						System.out.print((char)((65+(n-1)-j)));
					}
					else
						System.out.print((char)(65+(n-1)+j));

				}
					
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		return;
	}
	public static void main(String[] args) {
		int n=4;
		fun(n);
	}

}
