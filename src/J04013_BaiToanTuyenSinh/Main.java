package J04013_BaiToanTuyenSinh;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student st = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextDouble(),
				scanner.nextDouble());
		System.out.println(st);
	}
}
