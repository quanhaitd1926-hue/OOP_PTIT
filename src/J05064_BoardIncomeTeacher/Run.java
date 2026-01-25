package J05064_BoardIncomeTeacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Teacher> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			Teacher tea = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextLong());
			arr.add(tea);
		}
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(arr.get(i).getPositionID(), map.getOrDefault(arr.get(i).getPositionID(), 0) + 1);
			if (arr.get(i).getPositionID().equals("HT") && map.get(arr.get(i).getPositionID()) == 1) {
				System.out.println(arr.get(i));
			} else if (arr.get(i).getPositionID().equals("HP") && map.get(arr.get(i).getPositionID()) <= 2) {
				System.out.println(arr.get(i));
			} else if (arr.get(i).getPositionID().equals("GV"))
				System.out.println(arr.get(i));
		}
	}
}
