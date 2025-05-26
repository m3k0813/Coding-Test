import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		List<String> results = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			int r = scanner.nextInt();
			String s = scanner.next();
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				for (int k = 0; k < r; k++) {
					sb.append(c);
				}
			}
			results.add(sb.toString());
		}

		for (String s : results) {
			System.out.println(s);
		}
	}
}