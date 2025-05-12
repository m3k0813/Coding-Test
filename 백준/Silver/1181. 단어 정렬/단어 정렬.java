import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			set.add(scanner.next());
		}

		List<String> list = new ArrayList<>(set);
		Collections.sort(list, Comparator.comparing(String::length)
			.thenComparing(Comparator.naturalOrder()));

		for(String str : list) {
			System.out.println(str);
		}
	}
}