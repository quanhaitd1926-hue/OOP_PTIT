package J05079_J05080_CourseSection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Course> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Course cour = new Course(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			arr.add(cour);
		}
		Collections.sort(arr, (o1, o2) -> o1.getGroupCourse().compareTo(o2.getGroupCourse()));
		int m = sc.nextInt();
		sc.nextLine();
		while (m-- > 0) {
			String s = sc.nextLine();
			int frequency = 0;
			for (int i = 0; i < n; i++) {
				if (s.equals(arr.get(i).getIdCourse())) {
					if (frequency == 0) {
						System.out.println("Danh sach nhom lop mon " + arr.get(i).getNameCourse() + ":");
						++frequency;
					}
					System.out.println(arr.get(i));
				}
			}
		}

	}
}
