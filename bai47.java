package lab01;

public class bai47 {
	public static void main(String[] args) {
		int n = 5;
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
