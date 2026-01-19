package J05005_ListObjectStudent_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		Collections.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getGpa() > o2.getGpa())
					return -1;
				else
					return 1;
			}

		});

		for (Student s : arr)
			System.out.println(s);
	}
}
