package J05006_ListObjectStaff;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
		for (Staff staff : arr)
			System.out.println(staff);
	}
}
