import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		int max = 0;

		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

		for (int i = 0; i < list.size() - 2; i++) {
			for(int j = i + 1; j < list.size() - 1; j++) {
				for (int k = j + 1; k < list.size(); k++) {
					int sum = list.get(i) + list.get(j) + list.get(k);
					if (sum <= m && sum > max) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}
}