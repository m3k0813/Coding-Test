import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();


		while (true) {
			int[] a = new int[3];
			a[0] = scanner.nextInt();
			a[1] = scanner.nextInt();
			a[2] = scanner.nextInt();

			Arrays.sort(a);

			if (a[0] == 0 && a[1] == 0 && a[2] == 0) {
				break;
			}

			if (Math.pow(a[0], 2) + Math.pow(a[1], 2) == Math.pow(a[2], 2)) {
				list.add("right");
			} else {
				list.add("wrong");
			}
		}
		for (String s : list) {
			System.out.println(s);
		}
	}
}