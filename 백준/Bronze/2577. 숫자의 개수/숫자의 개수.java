import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int mul = a * b * c;

		char[] chArr = String.valueOf(mul).toCharArray();

		int[] count = new int[10];

		for (char ch : chArr) {
			count[ch - '0']++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
	}
}