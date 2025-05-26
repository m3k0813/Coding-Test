import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int h = scanner.nextInt();
		int m = scanner.nextInt();

		if (m > 45) {
			m -= 45;
		} else if (m == 45) {
			m = 0 ;
		} else {
			m += 15;
			if (h == 0) {
				h = 23;
			} else {
				h--;
			}
		}
		System.out.println(h + " " + m);
	}
}