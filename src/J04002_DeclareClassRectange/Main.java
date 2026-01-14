package J04002_DeclareClassRectange;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s+");
		double width = Double.parseDouble(arr[0]);
		double length = Double.parseDouble(arr[1]);
		String color = arr[2];
		if (width <= 0 || length <= 0) {
			System.out.println("INVALID");
			return;
		}
		Rectange rec = new Rectange(width, length, color);
		System.out.println(rec);
	}
}
