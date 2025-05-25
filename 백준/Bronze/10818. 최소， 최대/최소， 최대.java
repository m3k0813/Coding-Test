import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();

			if (x > max) {
				max = x;
			}

			if (x < min) {
				min = x;
			}
		}
		System.out.println(min + " " + max);
	}
}