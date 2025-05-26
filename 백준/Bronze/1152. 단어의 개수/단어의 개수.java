import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		s = s.trim();

		if (s.isEmpty()) {
			System.out.println(0);
		}else{
			int n = s.split(" ").length;
			System.out.println(n);
		}
	}
}