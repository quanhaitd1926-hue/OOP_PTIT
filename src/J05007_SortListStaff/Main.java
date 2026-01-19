package J05007_SortListStaff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static int getDays(String s) {
		String[] arr = s.split("\\s+");
		String days = arr[0];
		return Integer.parseInt(days);
	}

	public static int getMonths(String s) {
		String[] arr = s.split("\\s+");
		String months = arr[1];
		return Integer.parseInt(months);
	}

	public static int getYears(String s) {
		String[] arr = s.split("\\s+");
		String years = arr[2];
		return Integer.parseInt(years);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Staff> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Staff st = new Staff(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
					scanner.nextLine(), scanner.nextLine());
			arr.add(st);
		}
		Collections.sort(arr, new Comparator<Staff>() {

			@Override
			public int compare(Staff o1, Staff o2) {
				if (getYears(o1.getBirth()) != getYears(o2.getBirth())) {
					return getYears(o1.getBirth()) - getYears(o2.getBirth());
				} else {
					if (getMonths(o1.getBirth()) != getMonths(o2.getBirth())) {
						return getMonths(o1.getBirth()) - getMonths(o2.getBirth());
					} else
						return getDays(o1.getBirth()) - getDays(o2.getBirth());
				}
			}

		});

		for (Staff staff : arr)
			System.out.println(staff);

	}

}
