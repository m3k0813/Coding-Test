import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 1;

		while (true) {
			if (n <= 1 + 3 * i * (i - 1)) {
				System.out.println(i);
				break;
			}

			i++;
		}
	}
}