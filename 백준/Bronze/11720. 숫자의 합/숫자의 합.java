import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		String s = scanner.next();
		String[] arr = s.split("");
		int sum = 0;

		for (String st : arr) {
			sum += Integer.valueOf(st);
		}
		System.out.println(sum);
	}
}