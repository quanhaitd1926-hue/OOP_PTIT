package J04005_DeclareClassCandidate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Candidate candidate = new Candidate(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(),
				scanner.nextDouble(), scanner.nextDouble());
		System.out.println(candidate);
	}
}
