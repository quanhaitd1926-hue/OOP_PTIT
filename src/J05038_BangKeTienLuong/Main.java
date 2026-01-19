package J05038_BangKeTienLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		long sumFee = 0;
		ArrayList<Employee> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int id = i + 1;
			String name = scanner.nextLine();
			long salary = scanner.nextLong();
			int work = scanner.nextInt();
			scanner.nextLine();
			String position = scanner.nextLine();
			Employee em = new Employee(id, name, salary, work, position);
			arr.add(em);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
			sumFee += arr.get(i).getSumFee();
		}

		System.out.printf("Tong chi phi tien luong: %d", sumFee);

	}
}
