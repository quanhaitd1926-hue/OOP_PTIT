package J04006_DeclareClassStudent;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id = "B20DCCN001";
		Student st = new Student(id, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
		System.out.println(st);
	}
}
