package J04012_CaculationWork;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id = "NV01";
		String name = scanner.nextLine();
		int salary = scanner.nextInt();
		int numberWoking = scanner.nextInt();
		scanner.nextLine();
		String position = scanner.nextLine();
		Staff staff = new Staff(id, name, salary, numberWoking, position);
		System.out.println(staff);
	}
}
