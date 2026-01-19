package J04003_FractionClass;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Fraction frac = new Fraction(scanner.nextLong(), scanner.nextLong());
		System.out.println(frac);
	}
}
