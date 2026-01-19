package J05043_CaculationIncomeToEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Employee> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			Employee emp = new Employee(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextInt());
			arr.add(emp);
		}
		arr.forEach((Employee e) -> System.out.println(e));
	}
}
