package PatternAssignment;

public class P40 {
	public static void b(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n / 2 || (i - j) == -(n / 2) || (i + j) == 3 * (n / 2) || i - j == n / 2) {
					if (i <=n/2) {
						System.out.print((n+1)/2-i);
					} else {
						System.out.print(i+1-(n/2));
					}

				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] a) {
		b(9
				);
	}

}
