import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();

		String com = a + b;

		System.out.println(Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c));
		System.out.println(Integer.parseInt(com) - Integer.parseInt(c));
	}
}