package J04015_CaculatingTeacherIncome;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Teacher teacher = new Teacher(scanner.nextLine(), scanner.nextLine(), scanner.nextLong());
		System.out.println(teacher);
	}
}
