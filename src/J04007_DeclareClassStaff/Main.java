package J04007_DeclareClassStaff;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id = "00001";
		Staff staff = new Staff(id, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
				scanner.nextLine(), scanner.nextLine());
		System.out.println(staff);
	}
}
