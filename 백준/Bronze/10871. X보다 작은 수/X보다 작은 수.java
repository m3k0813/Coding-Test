import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int x = scanner.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			if (a < x) {
				list.add(a);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}