package PatternAssignment;

public class P3 {
	public static void b(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= 0 && i + j < 2 * n - 1 && i - j >= 0) {
					if (i < n) {
						System.out.print((n-1-i) + j);
					} else {
						System.out.print(i - (n - 1 )+ j);
					}
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}	
	}

	public static void main(String[] a) {
		b(4);
	}

}
