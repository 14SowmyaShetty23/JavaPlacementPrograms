package PatternAssignment;

public class P8 {	static void fun(int n){
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(j+i>=n-1&&j<=n-1&&i-j<=0)
			{
				System.out.print(-((n/2)-j));

			}
				
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	return;
}
public static void main(String[] args) {
	int n=7;
	fun(n);
}


}
