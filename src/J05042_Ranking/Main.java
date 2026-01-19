package J05042_Ranking;

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
			String name = scanner.nextLine();
			int[] assignment = new int[2];
			for (int j = 0; j < 2; j++) {
				assignment[j] = scanner.nextInt();
			}
			Student st = new Student(name, assignment);
			arr.add(st);
		}
		Collections.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getAssignmentCorect() != o2.getAssignmentCorect()) {
					return o2.getAssignmentCorect() - o1.getAssignmentCorect();
				} else {
					if (o1.getSubmit() != o2.getSubmit()) {
						return o2.getSubmit() - o1.getSubmit();
					} else
						return o1.getName().compareTo(o2.getName());
				}
			}

		});

		arr.forEach((Student s) -> System.out.println(s));

	}
}
