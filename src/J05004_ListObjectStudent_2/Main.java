package J05004_ListObjectStudent_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Student> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			Student st = new Student(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
					scanner.nextDouble());
			arr.add(st);
		}
		for (Student s : arr)
			System.out.println(s);
	}
}
