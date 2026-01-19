package J05050_J05051_ElectronicBill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Client> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			Client cli = new Client(i + 1, sc.nextLine(), sc.nextInt(), sc.nextInt());
			arr.add(cli);
		}
		Collections.sort(arr, (o1, o2) -> Long.compare(o2.sumMoney(), o1.sumMoney()));

		arr.forEach((Client c) -> System.out.println(c));
	}
}
