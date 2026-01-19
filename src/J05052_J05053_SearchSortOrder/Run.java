package J05052_J05053_SearchSortOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Order> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			Order or = new Order(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
			arr.add(or);
		}

		Collections.sort(arr, (o1, o2) -> Long.compare(o1.Money(), o2.Money()));

		arr.forEach((Order o) -> System.out.println(o));
	}
}
