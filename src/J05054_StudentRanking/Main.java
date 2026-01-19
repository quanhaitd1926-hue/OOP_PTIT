package J05054_StudentRanking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Student> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int ranking = 0;
			sc.nextLine();
			Student st = new Student(i + 1, sc.nextLine(), sc.nextDouble(), ranking);
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
		int stt = 1;
		arr.get(0).setRanking(1);
		for (int i = 1; i < n; i++) {
			if (arr.get(i).getGpa() == arr.get(i - 1).getGpa()) {
				arr.get(i).setRanking(arr.get(i - 1).getRanking());
				++stt;
			} else {
				++stt;
				arr.get(i).setRanking(stt);
			}
		}
//		arr.get(0).setRanking(1);
//		for (int i = 1; i < n; i++) {
//		    if (arr.get(i).getGpa() == arr.get(i - 1).getGpa()) {
//		        arr.get(i).setRanking(arr.get(i - 1).getRanking());
//		    } else {
//		        arr.get(i).setRanking(i + 1);
//		    }
//		}
		ArrayList<Student> st1 = new ArrayList<>();
		arr.forEach((Student s) -> st1.add(s));
		Collections.sort(st1, (o1, o2) -> o1.getId().compareTo(o2.getId()));
		st1.forEach((Student s) -> System.out.println(s));
	}
}
