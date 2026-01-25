package J06003_J06004_ManageGroupAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Student> arrStu = new ArrayList<>();
		ArrayList<String> arrAssignment = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			Student st = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
			arrStu.add(st);
		}
		sc.nextLine();
		for (int i = 0; i < m; i++) {
			String s = sc.nextLine();
			arrAssignment.add(s);
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int group = sc.nextInt();
			System.out.printf("DANH SACH NHOM %d:\n", group);
			for (int i = 0; i < n; i++) {
				if (arrStu.get(i).getGroupNumber() == group) {
					System.out.println(arrStu.get(i));
				}
			}
			--group;
			System.out.println("Bai tap dang ky: " + arrAssignment.get(group));
		}
	}
}
