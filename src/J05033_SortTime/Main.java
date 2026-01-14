package J05033_SortTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Time time = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
			arr.add(time);
		}
		Collections.sort(arr, new Comparator<Time>() {

			@Override
			public int compare(Time o1, Time o2) {
				if (o1.getHours() != o2.getHours()) {
					return o1.getHours() - o2.getHours();
				} else {
					if (o1.getMinutes() != o2.getMinutes()) {
						return o1.getMinutes() - o2.getMinutes();
					} else {
						return o1.getSeconds() - o2.getSeconds();
					}
				}
			}

		});

		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
		}
	}
}
