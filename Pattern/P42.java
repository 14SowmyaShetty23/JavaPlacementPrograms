
package PatternAssignment;

public class P42 {
	public static void b(int n) {
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <=n; j++) {
				if (i + j == n / 2 || (i - j) == -(n / 2) || (i + j) == 3 * (n / 2) || i - j == n / 2) {
					if (i <=n/2) {
						System.out.print((char)(65+((n+1)/2-i)));
					} else {
						System.out.print((char)(65+1-(n/2)+i-1));
					}

				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] a) {
		b(8
				);
	}

}
