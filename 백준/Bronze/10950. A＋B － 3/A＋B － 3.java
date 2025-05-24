import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			list.add(a+b);
		}

		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}