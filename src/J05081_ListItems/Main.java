package J05081_ListItems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Items> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			Items item = new Items(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
			arr.add(item);
		}
		Collections.sort(arr, new Comparator<Items>() {

			@Override
			public int compare(Items o1, Items o2) {
				if (o1.getProfit() > o2.getProfit())
					return -1;
				else
					return 1;
			}

		});

		for (Items i : arr) {
			System.out.println(i);
		}

	}
}
