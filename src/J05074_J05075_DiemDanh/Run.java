package J05074_J05075_DiemDanh;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Student> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String pointAttend = "";
			int point = -1;
			Student st = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), pointAttend, point);
			arr.add(st);
		}
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String[] temp = s.split("\\s+");
			for (int j = 0; j < n; j++) {
				if (temp[0].equals(arr.get(j).getId())) {
					arr.get(j).setPointAttend(temp[1]);
					break;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			int point = 10;
			for (int j = 0; j < arr.get(i).getPointAttend().length(); j++) {
				if (arr.get(i).getPointAttend().charAt(j) == 'm')
					point -= 1;
				else if (arr.get(i).getPointAttend().charAt(j) == 'v')
					point -= 2;
				else
					continue;
			}
			if (point <= 0)
				arr.get(i).setPoint(0);
			else
				arr.get(i).setPoint(point);
		}
		String className = sc.nextLine();
		for (int i = 0; i < n; i++) {
			if (className.equals(arr.get(i).getClassName())) {
				if (arr.get(i).getPoint() == 0) {
					System.out.println(arr.get(i) + " KDDK");
				} else
					System.out.println(arr.get(i));
			}
		}
	}
}
