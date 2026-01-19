package J05018_ScoreBoard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Student> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Student st = new Student(i + 1, scanner.nextLine(), scanner.nextLine());
			arr.add(st);
		}
		Collections.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getPoint() != o2.getPoint()) {
					if (o1.getPoint() > o2.getPoint())
						return -1;
					else
						return 1;
				} else
					return o1.getId().compareTo(o2.getId());
			}

		});

		arr.forEach((Student s) -> System.out.println(s));
	}
}
