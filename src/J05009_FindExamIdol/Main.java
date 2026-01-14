package J05009_FindExamIdol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Student> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			Student st = new Student(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(),
					scanner.nextDouble(), scanner.nextDouble());
			arr.add(st);
		}
		double max_value = -1;
		for (int i = 0; i < n; i++) {
			if (arr.get(i).getSumPoints() > max_value) {
				max_value = arr.get(i).getSumPoints();
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr.get(i).getSumPoints() == max_value) {
				System.out.println(arr.get(i));
			}
		}
	}
}
