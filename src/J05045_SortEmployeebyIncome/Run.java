package J05045_SortEmployeebyIncome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Employee> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			Employee emp = new Employee(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextInt());
			arr.add(emp);
		}
		Collections.sort(arr, (o1, o2) -> Long.compare(o1.getIncome(), o2.getIncome()));

		arr.forEach((Employee e) -> System.out.println(e));
	}
}
