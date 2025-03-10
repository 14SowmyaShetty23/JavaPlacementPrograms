package PatternAssignment;

public class P7 {
	static void fun(int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<2*n-1;j++){
				if(j+i>=n-1&&j<=n-1&&i-j<=0)
				{
					if(i<=n/2) {
					System.out.print(((n-1)-i-j+1)+(n/2)-1);
					}
					else
					{
					//	System.out.print((n/2-1)+i+1-j);
						System.out.print((n/2)+i-j);
					}

				}
					
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		return;
	}
	public static void main(String[] args) {
		int n=9;
		fun(n);
	}

}
